package edw.icecat.ws;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;

import edw.despec.Product;
import edw.despec.Product.IceCatFeature;
import edw.icecat.ws.response.CategoryFeatureGroup;
import edw.icecat.ws.response.ICECATInterface;
import edw.icecat.ws.response.ProductFamily;
import edw.icecat.ws.response.ProductFeature;
import edw.icecat.xml.FeatureHandler;
import edw.icecat.xml.FeaturesListCallback;
import edw.icecat.xml.FileIndexCallback;
import edw.icecat.xml.FileIndexHandler;
import edw.repository.IcecatFeatureDao;
import edw.repository.IcecatFeatureRepository;
import edw.repository.IcecatSupplierDao;
import edw.repository.IcecatSupplierRepository;
import edw.util.CallbackSAXParser;

@Service
public class IcecatMapper {

	// System.setProperty("javax.xml.transform.TransformerFactory","net.sf.saxon.TransformerFactoryImpl");

	@Value("#{icecatProperties.ICECAT_LOCAL_DIR}")
	public File icecatLocalDir;

	final String supplierMappingPattern = "/ICECAT-interface/SupplierMappings/SupplierMapping[Symbol=''{0}'']/@supplier_id";
	// TODO: use XSLT 2.0 for lower-case matching
	final String productMappingPattern = "/ICECAT-interface/files.index/file[Supplier_id=''{0}'' AND Prod_ID=''{1}'']/@Product_ID";

	@Autowired
	IcecatFeatureRepository icecatFeatureRepository;

	@Autowired
	IcecatSupplierRepository icecatSupplierRepository;

	@Cacheable("supplier_mapping")
	public String getSupplierMapping(String name) throws Exception {
		if (StringUtils.isEmpty(name)) {
			return null;
		}
		// try from DB first
		IcecatSupplierDao supplier = icecatSupplierRepository.findOneByNameIgnoreCase(name);
		if (supplier != null) {
			return supplier.getIcecatSupplierId();
		}

		File supplierMapping = new File(icecatLocalDir, "supplier_mapping.xml");

		Document xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(supplierMapping);
		// TODO: validate/escape for XPath
		String expression = MessageFormat.format(supplierMappingPattern, name);
		String result = XPathFactory.newInstance().newXPath().compile(expression).evaluate(xmlDocument);
		// workarounds: try uppercase and lowercase match
		if (StringUtils.isEmpty(result)) {
			expression = MessageFormat.format(supplierMappingPattern, name.toUpperCase());
			result = XPathFactory.newInstance().newXPath().compile(expression).evaluate(xmlDocument);
		}
		if (StringUtils.isEmpty(result)) {
			expression = MessageFormat.format(supplierMappingPattern, name.toLowerCase());
			result = XPathFactory.newInstance().newXPath().compile(expression).evaluate(xmlDocument);
		}
		if (StringUtils.isEmpty(result)) {
			return null;
		}
		return result;
	}

	// unusable, xpath is too slow
	public String getProductMapping(String supplierId, String partNumber) throws Exception {
		File filesIndex = new File(icecatLocalDir, "files.index.xml");
		Document xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(filesIndex);
		String expression = MessageFormat.format(productMappingPattern, supplierId, partNumber);
		String result = XPathFactory.newInstance().newXPath().compile(expression).evaluate(xmlDocument);
		return result;
	}

	@Cacheable("feature")
	public IcecatFeatureDao getFeature(String featureId) throws Exception {
		return icecatFeatureRepository.findOneByFeatureId(featureId);
	}

	public void parseFileIndex(FileIndexHandler handler) throws Exception {
		File filesIndex = new File(icecatLocalDir, "files.index.xml");
		FileIndexCallback c = new FileIndexCallback(handler);
		CallbackSAXParser csp = new CallbackSAXParser(c);
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(filesIndex));
		List<Exception> results = csp.execute(stream);
		stream.close();
	}

	public void parseFeaturesList(FeatureHandler handler) throws Exception {
		File files = new File(icecatLocalDir, "FeaturesList.xml");
		FeaturesListCallback c = new FeaturesListCallback(handler);
		CallbackSAXParser csp = new CallbackSAXParser(c);
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(files));
		List<Exception> results = csp.execute(stream);
		stream.close();
	}

	public Product parseProduct(ICECATInterface object, Product p) throws Exception {
		Map<String, String> featureGroupMap = new LinkedHashMap<String, String>();
		edw.icecat.ws.response.Product product = object.getProduct();
		for (CategoryFeatureGroup fg : product.getCategoryFeatureGroup()) {
			featureGroupMap.put(fg.getID().toString(), fg.getFeatureGroup().get(0).getName().get(0).getValueAttr());
		}

		p.iceCat = p.new IceCatInfo();
		p.iceCat.category = product.getCategory().get(0).getName().get(0).getValueAttr();
		p.iceCat.icecatId = product.getID().toString();
		p.iceCat.title = product.getTitle();
		p.iceCat.brand = product.getSupplier().getName();
		ProductFamily productFamily = product.getProductFamily();
		if (productFamily != null) {
			if (productFamily.getName().size() > 0) {
				p.iceCat.productFamily = productFamily.getName().get(0).getValueAttr();
			}
			if (productFamily.getSeries().size() > 0) {
				p.iceCat.productSeries = productFamily.getSeries().get(0).getName().get(0).getValueAttr();
			}
		}
		p.iceCat.modelName = product.getName();
		p.iceCat.productCode = product.getProdId();
		if (product.getEANCode().size() > 0) {
			BigInteger eanCode = product.getEANCode().get(0).getEAN();
			if (eanCode != null) {
				p.iceCat.eanCode = eanCode.toString();
			}
		}

		p.iceCat.highPic = product.getHighPic();
		p.iceCat.lowPic = product.getLowPic();
		p.iceCat.thumbPic = product.getThumbPic();

		p.iceCat.descriptionLong = product.getProductDescription().get(0).getLongDesc();
		if (p.iceCat.descriptionLong != null) {
			p.iceCat.descriptionLong = p.iceCat.descriptionLong.replace("\\n", "<br/>");
		}
		p.iceCat.descriptionShort = product.getProductDescription().get(0).getShortDesc();
		if (p.iceCat.descriptionShort != null) {
			p.iceCat.descriptionShort = p.iceCat.descriptionShort.replace("\\n", "<br/>");
		}
		p.iceCat.summaryShort = product.getSummaryDescription().get(0).getShortSummaryDescription().getValue();
		if (p.iceCat.summaryShort != null) {
			p.iceCat.summaryShort = p.iceCat.summaryShort.replace("\\n", "<br/>");
		}
		p.iceCat.summaryLong = product.getSummaryDescription().get(0).getLongSummaryDescription().getValue();
		if (p.iceCat.summaryLong != null) {
			p.iceCat.summaryLong = p.iceCat.summaryLong.replace("\\n", "<br/>");
		}

		p.iceCat.features = new LinkedHashMap<>();
		for (ProductFeature pf : product.getProductFeature()) {
			String featureGroupName = featureGroupMap.get(pf.getCategoryFeatureGroupID().toString());
			if (!p.iceCat.features.containsKey(featureGroupName)) {
				p.iceCat.features.put(featureGroupName, new ArrayList<IceCatFeature>());
			}
			List<IceCatFeature> featureList = p.iceCat.features.get(featureGroupName);
			IceCatFeature feature = p.new IceCatFeature();
			feature.featureId = pf.getFeature().get(0).getID().toString();
			feature.name = pf.getFeature().get(0).getName().get(0).getValueAttr();
			if (feature.name != null) {
				// replace all dots because of Drupal import mapping config
				feature.name = feature.name.replace('.', '_');
			}
			String featureId = pf.getFeature().get(0).getID().toString();
			IcecatFeatureDao featureDao = this.getFeature(featureId);
			if (featureDao != null) {
				feature.type = featureDao.getType();
			}
			feature.presentationValue = pf.getPresentationValue();
			if ("multi_dropdown".equals(feature.type)) {
				// split the values by comma
				feature.value = StringUtils.trimArrayElements(pf.getValue().split(","));
			} else {
				if (StringUtils.isEmpty(pf.getValue())) {
					if (pf.getLocalValue() != null && pf.getLocalValue().size() > 0) {
						feature.value = pf.getLocalValue().get(0).getValue();
					}
					if (StringUtils.isEmpty(feature.value)) {
						feature.value = feature.presentationValue;
					}
				} else {
					feature.value = pf.getValue();
				}
			}
			feature.searchable = pf.isSearchable();
			featureList.add(feature);
		}
		return p;
	}

	public String getVendorMapping(String mfrNr) {
		switch (mfrNr) {
		case "MICROME":
			return "MicroMemory";
		}
		return mfrNr;
	}

}
