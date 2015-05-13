package edw.repository;

import org.springframework.data.repository.CrudRepository;

public interface IcecatSupplierRepository extends CrudRepository<IcecatSupplierDao, Long> {

	IcecatSupplierDao findOneByNameIgnoreCase(String name);
	IcecatSupplierDao findOneByIcecatSupplierId(String icecatSupplierId);

}
