package edw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZcrmProdhRepository extends CrudRepository<ZcrmProdhDao, Long> {

	ZcrmProdhDao findOneByProdh(String prodh);

	@Query("select p from ZcrmProdhDao p order by length(p.prodh), p.prodh")
	List<ZcrmProdhDao> findAllOrdered();
}
