package edw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZcrmProdusRepository extends CrudRepository<ZcrmProdusDao, Long> {

	List<ZcrmProdusDao> findByMatnr(String matnr);
	
	@Query("select p from ZcrmProdusDao p where p.prdha like ?1 and p.lvorm = ''")
	List<ZcrmProdusDao> findByPrdhaLike(String prodh);

	@Query("select p from ZcrmProdusDao p where p.prdha != '' and p.lvorm = ''")
	List<ZcrmProdusDao> findAllActive();
	
	@Query("select p from ZcrmProdusDao p where p.mfrnr in ?1 and p.lvorm = ''")
	List<ZcrmProdusDao> findByMfrnrIn(List<String> vendorList);

}
