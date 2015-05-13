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

import edw.repository.IcecatSupplierDao;
import edw.repository.IcecatSupplierRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/TestIcecat-context.xml")
public class TestIcecatSuppliers {
	@Autowired
	IcecatSupplierRepository icecatSupplierRepository;

	@Value("#{icecatProperties.ICECAT_LOCAL_DIR}")
	public File icecatLocalDir;

	private final Log logger = LogFactory.getLog(getClass());

	@Test
	public void testLoadSuppliers() throws Exception {
		File supplierFile = new File(icecatLocalDir, "SuppliersList.xml");
		Document xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(supplierFile);
		NodeList suppliers = xmlDocument.getElementsByTagName("Supplier");
		for (int i = 0; i < suppliers.getLength(); i++) {
			Node node = suppliers.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				String icecatSupplierId = eElement.getAttribute("ID");
				IcecatSupplierDao supplier = icecatSupplierRepository.findOneByIcecatSupplierId(icecatSupplierId);
				if (supplier == null ) {
					supplier = new IcecatSupplierDao();
					supplier.setIcecatSupplierId(icecatSupplierId);
					supplier.setName(eElement.getAttribute("Name"));
					supplier.setLogoPic(eElement.getAttribute("LogoPic"));
					logger.info("Creating supplier " + supplier.getName());
					icecatSupplierRepository.save(supplier);
				}
			}
		}
	}
	
	@Test
	public void testFindOneSupplier() {
		IcecatSupplierDao supplier = icecatSupplierRepository.findOneByNameIgnoreCase("OLIVETTI");
		assertNotNull(supplier);
		assertEquals("Olivetti", supplier.getName());
	}
}
