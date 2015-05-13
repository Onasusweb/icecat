package edw.repository;

import org.springframework.data.repository.CrudRepository;

public interface ProdIcecatRepository extends CrudRepository<ProdIcecatDao, String> {

	ProdIcecatDao findOneByEan(String ean);

	ProdIcecatDao findOneByBrandAndPartn(String brand, String partn);

}
