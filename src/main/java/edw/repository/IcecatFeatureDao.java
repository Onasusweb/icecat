package edw.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "icecat_feature")
public class IcecatFeatureDao extends AbstractEntity {

	@Column(nullable = false)
	protected String featureId;
	@Column(nullable = true)
	protected String type;
	@Column(nullable = true)
	protected String name;

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
