package edw.repository;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.StringUtils;

import edw.despec.Product.IceCatFeature;

@Embeddable
public class IcecatProductFeatureDao {
	
	protected String featureId;
	
	@Column(nullable = true)
	protected String featureGroup;
	@Column(nullable = true)
	protected String type;
	@Column(nullable = true)
	protected String name;
	@Column(length = 9999, nullable = true)
	protected String value;
	@Column(length = 9999, nullable = true)
	protected String presentationValue;
	@Column(nullable = true)
	protected Boolean searchable;

	public IcecatProductFeatureDao() {

	}

	public IcecatProductFeatureDao(String featureGroup, IceCatFeature feature) {
		this.featureGroup = featureGroup;
		this.featureId = feature.featureId;
		this.type = feature.type;
		this.name = feature.name;
		if ( feature.value  == null ) {
			this.value = null;
		} else if ( feature.value instanceof String) {
			this.value = (String) feature.value;
		} else if (feature.value instanceof java.util.List ) {
			this.value = StringUtils.join((java.util.List<String>)feature.value, ",");
		} else if (feature.value instanceof String[] ) {
			this.value = StringUtils.join((String[])feature.value, ",");
		} else {
			this.value = feature.value.toString();
		}
		this.presentationValue = feature.presentationValue;
		this.searchable = feature.searchable;
	}

}
