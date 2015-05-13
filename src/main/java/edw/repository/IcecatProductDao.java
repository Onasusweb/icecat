package edw.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import edw.despec.Product.IceCatFeature;

@Entity
@Table(name = "icecat_product")
public class IcecatProductDao extends AbstractEntity {
	protected String matNr;
	protected String mfrNr;
	protected String mfrpn;
	protected String extwg;
	protected String maktx;
	protected String prdha;
	protected String ean11;
	protected String mvgr1;
	protected String mvgr2;

	@Column(length=50000)
	protected String text;
	protected String icecatId;

	protected String title;
	protected String brand;
	protected String productFamily;
	protected String productSeries;
	protected String modelName;
	protected String productCode;
	protected String eanCode;
	protected String category;

	protected String highPic;
	protected String lowPic;
	protected String thumbPic;

	@Column(length=50000)
	protected String descriptionLong;
	@Column(length=50000)
	protected String descriptionShort;
	@Column(length=50000)
	protected String summaryShort;
	@Column(length=50000)
	protected String summaryLong;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "icecat_product_features", joinColumns = @JoinColumn(name = "productId"))
	@OrderColumn(name="featureNo")
	private List<IcecatProductFeatureDao> features;

	public IcecatProductDao() {

	}

	public void copyProperties(edw.despec.Product product) {
		this.matNr = product.despec.matNr;
		this.mfrNr = product.despec.mfrNr;
		this.mfrpn = product.despec.mfrpn;
		this.extwg = product.despec.extwg;
		this.maktx = product.despec.maktx;
		this.prdha = product.despec.prdha;
		this.ean11 = product.despec.ean11;
		this.mvgr1 = product.despec.mvgr1;
		this.mvgr2 = product.despec.mvgr2;
		this.text = product.despec.text;

		this.icecatId = product.iceCat.icecatId;
		this.title = product.iceCat.title;
		this.brand = product.iceCat.brand;
		this.productFamily = product.iceCat.productFamily;
		this.productSeries = product.iceCat.productSeries;
		this.modelName = product.iceCat.modelName;
		this.productCode = product.iceCat.productCode;
		this.eanCode = product.iceCat.eanCode;
		this.category = product.iceCat.category;
		this.highPic = product.iceCat.highPic;
		this.lowPic = product.iceCat.lowPic;
		this.thumbPic = product.iceCat.thumbPic;
		this.descriptionLong = product.iceCat.descriptionLong;
		this.descriptionShort = product.iceCat.descriptionShort;
		this.summaryShort = product.iceCat.summaryShort;
		this.summaryLong = product.iceCat.summaryLong;

		if (product.iceCat.features != null) {
			if ( features == null ) {
				features = new ArrayList<>();
			} else {
				features.clear();
			}
			for (String featureGroup : product.iceCat.features.keySet()) {
				List<IceCatFeature> featureList = product.iceCat.features.get(featureGroup);
				for (IceCatFeature feature : featureList) {
					IcecatProductFeatureDao productFeature = new IcecatProductFeatureDao(featureGroup, feature);
					features.add(productFeature);
				}
			}
		}
	}

	public List<IcecatProductFeatureDao> getFeatures() {
		return features;
	}

	public void setFeatures(List<IcecatProductFeatureDao> features) {
		this.features = features;
	}

	public String getIcecatId() {
		return icecatId;
	}

	public void setIcecatId(String icecatId) {
		this.icecatId = icecatId;
	}

}
