package icecat;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import edw.repository.IcecatProductMappingDao;
import edw.repository.IcecatProductMappingRepository;
import edw.repository.IcecatSupplierDao;
import edw.repository.IcecatSupplierRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/TestIcecat-context.xml")
public class TestIcecatProductMapping {
	@Autowired
	IcecatProductMappingRepository icecatProductMappingRepository;

	@Value("#{icecatProperties.ICECAT_LOCAL_DIR}")
	public File icecatLocalDir;

	private final Log logger = LogFactory.getLog(getClass());

	//@Test
	public void testLoadProductMappings() throws Exception {
		File supplierFile = new File(icecatLocalDir, "product_mapping.xml");
		Document xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(supplierFile);
		NodeList mappings = xmlDocument.getElementsByTagName("ProductMapping");
		for (int i = 0; i < mappings.getLength(); i++) {
			Node node = mappings.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				String productId = eElement.getAttribute("product_id");
				IcecatProductMappingDao mapping = icecatProductMappingRepository.findOneByProductId(productId);
				if ( mapping == null ) {
					mapping = new IcecatProductMappingDao();
					mapping.setProductId(productId);
					mapping.setProdId(eElement.getAttribute("prod_id"));
					mapping.setSupplierId(eElement.getAttribute("supplier_id"));
					mapping.setmProdId(eElement.getAttribute("m_prod_id"));
					mapping.setMapSupplierId(eElement.getAttribute("map_supplier_id"));
					logger.info("Creating mapping " + mapping.getProductId());
					icecatProductMappingRepository.save(mapping);
				}
			}
		}
	}

}
