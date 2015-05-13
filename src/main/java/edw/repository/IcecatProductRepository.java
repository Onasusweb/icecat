package edw.repository;

import org.springframework.data.repository.CrudRepository;

public interface IcecatProductRepository extends CrudRepository<IcecatProductDao, Long> {

	IcecatProductDao findOneByMatNr(String matNr);

}
