package edw.icecat.xml;

import java.util.Map;

import edw.repository.IcecatFeatureDao;
import edw.util.CallbackSAXParser.SaxCallback;
import edw.util.CallbackSAXParser.Values;

public class FeaturesListCallback {
	FeatureHandler handler;

	public FeaturesListCallback(FeatureHandler handler) {
		super();
		this.handler = handler;
	}

	String featureName;

	@SaxCallback("ICECAT-interface.Response.FeaturesList.Feature")
	public void onFeature(String path, Values values, Map<String, String> attributes) {
		IcecatFeatureDao feature = new IcecatFeatureDao();
		feature.setFeatureId(attributes.get("ID"));
		feature.setType(attributes.get("Type"));
		feature.setName(this.featureName);
		handler.handle(feature);
		this.featureName = null;
	}

	@SaxCallback("ICECAT-interface.Response.FeaturesList.Feature.Names.Name")
	public void onFeatureName(String path, Values values, Map<String, String> attributes) {
		String language = attributes.get("langid");
		if ("1".equals(language)) {
			featureName = values.get("ICECAT-interface.Response.FeaturesList.Feature.Names.Name");
		}
	}
}
