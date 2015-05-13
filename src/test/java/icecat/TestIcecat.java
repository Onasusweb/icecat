package icecat;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edw.icecat.ws.IcecatMapper;
import edw.repository.IcecatFileIndexDao;
import edw.repository.IcecatFileIndexRepository;
import edw.repository.ProdIcecatDao;
import edw.repository.ProdIcecatRepository;
import edw.repository.ZcrmProdusDao;
import edw.repository.ZcrmProdusRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/TestIcecat-context.xml")
public class TestIcecat {
	@Autowired
	ZcrmProdusRepository zcrmProdusRepository;

	@Autowired
	ProdIcecatRepository prodIcecatRepository;

	@Autowired
	IcecatFileIndexRepository icecatFileIndexRepository;

	@Autowired
	IcecatMapper icecatMapper;


	private final Log logger = LogFactory.getLog(getClass());

	@Test
	public void test1() {
		List<ZcrmProdusDao> servers = zcrmProdusRepository.findByPrdhaLike("262120202020");
		logger.info(servers.size());
	}

	@Test
	public void test2() throws Exception {
		ProdIcecatDao product = prodIcecatRepository.findOneByBrandAndPartn("HP", "669132-425");
		assertEquals("0886112164690", product.getEan());
	}
	
	@Test
	public void testSupplierMapping() throws Exception {
		assertEquals("1", icecatMapper.getSupplierMapping("HP"));
		assertEquals("2", icecatMapper.getSupplierMapping("TOSHIBA"));
		assertEquals("1", icecatMapper.getSupplierMapping("hp"));
		assertEquals("109", icecatMapper.getSupplierMapping("Olivetti"));
	}

	//@Test
	public void testProductMapping() throws Exception {
		assertEquals("13845301", icecatMapper.getProductMapping("1", "669132-425"));
	}

	@Test
	public void testLoadByMProd() {
		java.util.List<IcecatFileIndexDao> fileIndexList = icecatFileIndexRepository.findBySupplierIdAndMProdsMprodId("26", "GT-I9300OKEDBT");
		assertEquals(1, fileIndexList.size());
	}
}
