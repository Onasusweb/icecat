package despecws;

import static org.junit.Assert.assertTrue;

import javax.sql.DataSource;
import javax.xml.ws.BindingProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sap.document.sap.soap.functions.mc_style.ZCRM_INFO_1_PortType;
import com.sap.document.sap.soap.functions.mc_style.ZCRM_INFO_1_Service;
import com.sap.document.sap.soap.functions.mc_style.ZcrmProdus;
import com.sap.document.sap.soap.functions.mc_style.ZcrmProdusTt;

import edw.repository.ZcrmProdusDao;
import edw.repository.ZcrmProdusRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/despecws-beans.xml")
public class TestZCRM_INFO_1 {

	@Autowired
	ZcrmProdusRepository repository;

	@Autowired
	DataSource dataSource;

	// @Test
	// runs in about 10 minutes
	public void testZcrmProdusJPA() {

		ZCRM_INFO_1_Service wsClient = new ZCRM_INFO_1_Service();
		ZCRM_INFO_1_PortType port = wsClient.getZCRMINFO1();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "RFC_ACCESS");
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "secret");

		ZcrmProdusTt response = port.zcrmInfo1("*", "DESR", "D1");
		//ZcrmProdusTt response = port.zcrmInfo1("MIN21926", "DESR", "D1");
		for (ZcrmProdus produs : response.getItem()) {
			ZcrmProdusDao produsDao = new ZcrmProdusDao();
			BeanUtils.copyProperties(produs, produsDao);
			repository.save(produsDao);
		}
	}

	// @Test
	public void testZCRM_INFO_1() throws Exception {

		ZCRM_INFO_1_Service wsClient = new ZCRM_INFO_1_Service();
		ZCRM_INFO_1_PortType port = wsClient.getZCRMINFO1();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "RFC_ACCESS");
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "secret");

		ZcrmProdusTt response = port.zcrmInfo1("MIN21926", "*", "*");
		assertTrue(response.getItem().size() > 0);
		// ObjectMapper jsonMapper = new ObjectMapper();
		// jsonMapper.writeValue(new File("products.json"), response.getItem());
	}

	@Test
	public void testDummy() {

	}
}