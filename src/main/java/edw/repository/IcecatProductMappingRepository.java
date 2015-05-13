package edw.repository;

import org.springframework.data.repository.CrudRepository;

public interface IcecatProductMappingRepository extends CrudRepository<IcecatProductMappingDao, Long> {

	IcecatProductMappingDao findOneBySupplierIdAndProdIdIgnoreCase(String supplierId, String prodId);
	IcecatProductMappingDao findOneByProductId(String productId);
}
