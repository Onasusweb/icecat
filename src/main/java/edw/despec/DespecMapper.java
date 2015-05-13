package edw.despec;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import edw.repository.ZcrmProdhDao;
import edw.repository.ZcrmProdhRepository;
import edw.repository.ZcrmProdusRepository;

@Service
public class DespecMapper {

	@Autowired
	ZcrmProdusRepository produsRepository;

	@Autowired
	ZcrmProdhRepository prodhRepository;

	@Cacheable("prodh")
	public ZcrmProdhDao getCategory(String prodh) {
		if (StringUtils.isBlank(prodh)) {
			ZcrmProdhDao other = new ZcrmProdhDao();
			other.setProdh("40");
			other.setVtext("Other");
			return other;
		}

		ZcrmProdhDao result = prodhRepository.findOneByProdh(prodh);
		if (result != null) {
			return result;
		}
		if (prodh.length() > 2) {
			// get parent category if description not found
			return getCategory(StringUtils.substring(prodh, 0, -2));
		}
		return null;
	}
	
	public List<Category> mapCategories() {
		Iterable<ZcrmProdhDao> prodhList = prodhRepository.findAllOrdered();
		
		LinkedList<Category> result = new LinkedList<>();
		HashSet<String> validParents = new HashSet<>(); 
		
		for ( ZcrmProdhDao prodh : prodhList ) {
			Category c = new Category();
			c.code = prodh.getProdh();
			c.name = prodh.getVtext();
			c.parent_code = StringUtils.trimToNull(StringUtils.substring(c.code, 0, -2));
			if ( c.parent_code != null && !validParents.contains(c.parent_code)) {
				c.parent_code = "N/A";
			}
			result.add(c);
			validParents.add(c.code);
		}
		return result;
	}

}
