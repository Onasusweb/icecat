package despecws;

import javax.sql.DataSource;
import javax.xml.ws.BindingProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sap.document.sap.soap.functions.mc_style.ZCRM_PRODH_PortType;
import com.sap.document.sap.soap.functions.mc_style.ZCRM_PRODH_Service;
import com.sap.document.sap.soap.functions.mc_style.ZcrmProdhTt;
import com.sap.document.sap.soap.functions.mc_style.ZcrmT179TProdh;

import edw.repository.ZcrmProdhDao;
import edw.repository.ZcrmProdhRepository;
import edw.repository.ZcrmProdusRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/despecws-beans.xml")
public class TestPRODH {

	@Autowired
	ZcrmProdhRepository prodhRepository;

	// @Test
	public void testZcrmProdusJPA() throws Exception {

		ZCRM_PRODH_Service wsClient = new ZCRM_PRODH_Service();
		ZCRM_PRODH_PortType port = wsClient.getZCRMPRODH();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "RFC_ACCESS");
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "secret");

		ZcrmProdhTt response = port.zcrmProdh();
		for (ZcrmT179TProdh item : response.getItem()) {
			ZcrmProdhDao prodhDao = new ZcrmProdhDao();
			BeanUtils.copyProperties(item, prodhDao);
			prodhRepository.save(prodhDao);
		}
	}

	@Test
	public void testDummy() {

	}
}