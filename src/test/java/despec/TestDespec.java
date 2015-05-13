package despec;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edw.despec.Category;
import edw.despec.DespecMapper;
import edw.repository.ZcrmProdhRepository;
import edw.repository.ZcrmProdusRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @Transactional - enable if you want rollback after tests
@ContextConfiguration("/TestDespec-context.xml")
public class TestDespec {

	@Autowired
	DespecMapper mapper;

	@Autowired
	ZcrmProdhRepository prodhRepository;

	@Autowired
	ZcrmProdusRepository produsRepository;

	@Test
	public void testSomeProdh() {
		assertEquals("Single Function Printer", mapper.getCategory("22202020").getVtext());
		assertEquals("Multifunction Printer", mapper.getCategory("22202021").getVtext());
		assertEquals("Dotmatrix", mapper.getCategory("22202022").getVtext());
		assertEquals("Label Printer", mapper.getCategory("22202023").getVtext());
		assertEquals("Type Writer", mapper.getCategory("22202024").getVtext());
		assertEquals("Large Format", mapper.getCategory("22202025").getVtext());
		assertEquals("Hardware", mapper.getCategory("262120").getVtext());
		assertEquals("Accessories", mapper.getCategory("262121").getVtext());

		// test parent category
		assertEquals("Paper", mapper.getCategory("222124212020").getVtext());
	}

	@Test
	public void exportProdh() throws Exception {
		List<Category> categories = mapper.mapCategories();
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer().withDefaultPrettyPrinter();
		File outFile = new File("data/categories.json");
		writer.writeValue(outFile, categories);
	}
	
	@Test
	public void exportProdhTree() throws Exception {
		List<Category> categories = mapper.mapCategories();
		Map<String, Map> categoryTree = new HashMap<String, Map>();
		Map<String, Map> parents = new HashMap<String, Map>();
		for ( Category category : categories ) {
			HashMap<String, Map> map = new HashMap<String, Map>();
			if ( category.parent_code == null ) {
				categoryTree.put(category.name, map);
				parents.put(category.code, map);
			} else {
				Map parent = parents.get(category.parent_code);
				// should not be null
				parent.put(category.name, map);
				parents.put(category.code, map);
			}
		}
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer().withDefaultPrettyPrinter();
		File outFile = new File("data/categories_tree.json");
		writer.writeValue(outFile, categoryTree);
	}

}