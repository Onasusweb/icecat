package edw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IcecatFileIndexRepository extends CrudRepository<IcecatFileIndexDao, Long> {

	IcecatFileIndexDao findOneBySupplierIdAndProdId(String supplierId, String prodId);
	List<IcecatFileIndexDao> findBySupplierIdAndMProdsMprodId(String supplierId, String mprodId);
	IcecatFileIndexDao findOneByEansEan(String ean);
}
