package edw.repository;

import org.springframework.data.repository.CrudRepository;

public interface IcecatFeatureRepository extends CrudRepository<IcecatFeatureDao, Long> {

	IcecatFeatureDao findOneByFeatureId(String featureId);

}
