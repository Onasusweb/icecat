package icecat;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edw.despec.DespecMapper;
import edw.despec.Product;
import edw.icecat.ws.IcecatMapper;
import edw.icecat.ws.RestService;
import edw.icecat.ws.response.ICECATInterface;
import edw.icecat.xml.FeatureHandler;
import edw.icecat.xml.FileIndexHandler;
import edw.repository.IcecatFeatureDao;
import edw.repository.IcecatFeatureRepository;
import edw.repository.IcecatFileIndexDao;
import edw.repository.IcecatFileIndexRepository;
import edw.repository.IcecatProductDao;
import edw.repository.IcecatProductRepository;
import edw.repository.ZcrmProdhDao;
import edw.repository.ZcrmProdusDao;
import edw.repository.ZcrmProdusRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/TestIcecat-context.xml")
public class TestIcecatProductLoader {

	@Autowired
	IcecatFileIndexRepository icecatFileIndexRepository;

	@Autowired
	IcecatFeatureRepository icecatFeatureRepository;

	@Autowired
	IcecatProductRepository icecatProductRepository;

	@Autowired
	ZcrmProdusRepository zcrmProdusRepository;

	@Autowired
	DataSource dataSource;

	@Autowired
	IcecatMapper icecatMapper;

	@Autowired
	DespecMapper despecMapper;

	@Autowired
	Jaxb2Marshaller icecatResponseMarshaller;

	@Autowired
	RestService restService;

	private final Log logger = LogFactory.getLog(getClass());

	@Test
	public void testDummy() {

	}

	// @Test
	// prepare to wait 60 minutes
	public void testImportAllIndexFiles() throws Exception {
		icecatMapper.parseFileIndex(new FileIndexHandler() {
			@Override
			public void handle(IcecatFileIndexDao file) {
				icecatFileIndexRepository.save(file);
			}
		});
	}

	// @Test
	public void testImportAllFeatures() throws Exception {
		icecatMapper.parseFeaturesList(new FeatureHandler() {
			@Override
			public void handle(IcecatFeatureDao feature) {
				icecatFeatureRepository.save(feature);
			}
		});
	}

	// @Test
	public void testUnmarshall() throws Exception {
		File f = new File("HP_669132-425.xml");
		StreamSource source = new StreamSource(f);
		ICECATInterface result = (ICECATInterface) icecatResponseMarshaller.unmarshal(source);
		Product product = new Product();
		icecatMapper.parseProduct(result, product);

		ObjectMapper mapper = new ObjectMapper();
		File outFile = new File("HP_669132-425_product.json");
		mapper.writeValue(outFile, product);
	}

	// @Test
	public void testFetchIcecatProduct() throws Exception {
		ICECATInterface icecatProduct = restService.getProductById("13845301");
		Product product = new Product();
		icecatMapper.parseProduct(icecatProduct, product);
		assertEquals("ML350p Gen8", product.iceCat.modelName);
	}

	// @Test
	public void testFetchIcecatProductReplaced() throws Exception {

		ICECATInterface icecatProduct = restService.getProductById("22124785");
		Product product = new Product();
		icecatMapper.parseProduct(icecatProduct, product);
		assertEquals("2p 10-GbE SFP+ A5500/E4800/E4500 Module", product.iceCat.modelName);
	}

	// @Test
	public void testFetchIcecatAccessRestricted() throws Exception {

		ICECATInterface icecatProduct = restService.getProductById("13379033");
		// should throw 404, with ErrorMessage "Access to this product and language is restricted."
		Product product = new Product();
		icecatMapper.parseProduct(icecatProduct, product);
		assertEquals("2p 10-GbE SFP+ A5500/E4800/E4500 Module", product.iceCat.modelName);
	}

	// @Test
	public void testFetchByPartNumberAccessRestricted() throws Exception {

		ICECATInterface icecatProduct = restService.getProductByPartNumber("84436", "OLIVETTI");
		// should throw 404, with ErrorMessage "Access to this product and language is restricted."
		assertEquals("You are not allowed to have Full ICEcat access", icecatProduct.getProduct().getErrorMessage());
	}

	@Test
	public void testImportProducts() throws Exception {
		List<ZcrmProdusDao> zcrmProdusList = zcrmProdusRepository.findByMatnr("MEICDBP483");
		// List<ZcrmProdusDao> zcrmProdusList = zcrmProdusRepository.findByMatnr("OLI84436");
		// String like = "262120%"; //servers
		// String like = "222020%"; //printers
		// String like = "22%"; //imaging and printing
		String like = "%"; // all
		List<String> vendors = Arrays.asList(new String[] { "MICROME" });
		// List<ZcrmProdusDao> zcrmProdusList = zcrmProdusRepository.findByPrdhaLike(like);
//		List<ZcrmProdusDao> zcrmProdusList = zcrmProdusRepository.findByMfrnrIn(vendors);

		for (ZcrmProdusDao zcrmProdus : zcrmProdusList) {
			// skip already loaded
			String matnr = zcrmProdus.getMatnr();
			IcecatProductDao icecatProductDao = icecatProductRepository.findOneByMatNr(matnr);
			if (icecatProductDao != null && icecatProductDao.getIcecatId() != null
					&& !"-1".equals(icecatProductDao.getIcecatId())) {
				// refresh only not-found products
				continue;
			}
			Product p = new Product();
			p.despec.matNr = matnr;
			p.despec.mfrNr = zcrmProdus.getMfrnr();
			p.despec.mfrpn = zcrmProdus.getMfrpn();
			p.despec.extwg = zcrmProdus.getExtwg();
			p.despec.maktx = zcrmProdus.getMaktx();
			p.despec.prdha = zcrmProdus.getPrdha();
			p.despec.prodh = zcrmProdus.getProdh();
			ZcrmProdhDao despecCategory = despecMapper.getCategory(zcrmProdus.getPrdha());
			p.despec.category_code = despecCategory.getProdh();
			p.despec.category = StringUtils.trimToNull(despecCategory.getVtext());

			p.despec.ean11 = zcrmProdus.getEan11();
			p.despec.mvgr1 = zcrmProdus.getMvgr1();
			p.despec.mvgr2 = zcrmProdus.getMvgr2();

			StringBuilder sb = new StringBuilder();
			if (StringUtils.isNotEmpty(zcrmProdus.getText0()))
				sb.append(zcrmProdus.getText0());
			if (StringUtils.isNotEmpty(zcrmProdus.getText1()))
				sb.append(zcrmProdus.getText1());
			if (StringUtils.isNotEmpty(zcrmProdus.getText2()))
				sb.append(zcrmProdus.getText2());
			if (StringUtils.isNotEmpty(zcrmProdus.getText3()))
				sb.append(zcrmProdus.getText3());
			if (StringUtils.isNotEmpty(zcrmProdus.getText4()))
				sb.append(zcrmProdus.getText4());
			if (StringUtils.isNotEmpty(zcrmProdus.getText5()))
				sb.append(zcrmProdus.getText5());
			p.despec.text = sb.toString();

			logger.info("Checking " + p.despec.matNr);
			String icecatSupplier = icecatMapper.getSupplierMapping(p.despec.mfrNr);
			if (icecatSupplier != null) {
				IcecatFileIndexDao icecatFileIndexDao = icecatFileIndexRepository.findOneBySupplierIdAndProdId(
						icecatSupplier, p.despec.mfrpn);
				if (icecatFileIndexDao == null) {
					List<IcecatFileIndexDao> icecatFileIndexDaoList = icecatFileIndexRepository
							.findBySupplierIdAndMProdsMprodId(icecatSupplier, p.despec.mfrpn);
					if (icecatFileIndexDaoList.size() > 0) {
						icecatFileIndexDao = icecatFileIndexDaoList.get(0);
					}
				}
				if (icecatFileIndexDao == null && StringUtils.isNotBlank(p.despec.ean11)) {
					icecatFileIndexDao = icecatFileIndexRepository.findOneByEansEan(p.despec.ean11);
				}
				if (icecatFileIndexDao != null) {
					ICECATInterface icecatProduct = restService.getProductById(icecatFileIndexDao.getProductId());
					if (icecatProduct != null) {
						icecatMapper.parseProduct(icecatProduct, p);
					}
				} else {
					logger.warn("No match for part number " + p.despec.mfrpn + " (supplier: " + icecatSupplier + ":"
							+ p.despec.mfrNr + "). Trying real-time interface.");
					// map vendor name
					
					ICECATInterface icecatProduct = restService.getProductByPartNumber(p.despec.mfrpn, icecatMapper.getVendorMapping(p.despec.mfrNr));
					if (icecatProduct.getProduct() != null) {
						if (icecatProduct.getProduct().getCode().intValue() == -1) {
							// no data, write error message
							p.iceCat.icecatId = "-1";
							p.iceCat.descriptionShort = icecatProduct.getProduct().getErrorMessage();
						} else {
							icecatMapper.parseProduct(icecatProduct, p);
						}
					} else {
						logger.warn("No match in real-time interface");
					}
				}
			} else {
				logger.warn("No match for supplier " + p.despec.mfrNr);
			}
			// write it
			ObjectMapper mapper = new ObjectMapper();
			File outFile = new File("data/" + p.despec.matNr.replace('/', '_').replace('\\', '_') + ".json");
			ObjectWriter writer = mapper.writer().withDefaultPrettyPrinter();
			writer.writeValue(outFile, p);

			// result.add(p);

			// persist
			IcecatProductDao pDao = icecatProductRepository.findOneByMatNr(p.despec.matNr);
			if (pDao == null) {
				pDao = new IcecatProductDao();
			}
			pDao.copyProperties(p);
			icecatProductRepository.save(pDao);
		}
		// ObjectMapper mapper = new ObjectMapper();
		// File outFile = new File("data/products.json");
		// mapper.writeValue(outFile, result);
	}

}
