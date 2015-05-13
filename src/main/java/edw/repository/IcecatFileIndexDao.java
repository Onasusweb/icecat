package edw.repository;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "icecat_file_index")
public class IcecatFileIndexDao extends AbstractEntity {

	@Column(nullable = false)
	protected String path;
	@Column(nullable = false)
	protected String productId;
	@Column(nullable = false)
	protected String updated;
	@Column(nullable = true)
	protected String dateAdded;
	@Column(nullable = false)
	protected String quality;
	@Column(nullable = false)
	protected String supplierId;
	@Column(nullable = false)
	protected String prodId;
	@Column(nullable = false)
	protected String catid;
	@Column(nullable = false)
	protected String onMarket;
	@Column(nullable = true)
	protected String stock;
	@Column(nullable = false)
	protected String modelName;
	@Column(nullable = false)
	protected String productView;
	@Column(nullable = true)
	protected String highPic;
	@Column(nullable = true)
	protected String highPicSize;
	@Column(nullable = true)
	protected String highPicWidth;
	@Column(nullable = true)
	protected String highPicHeight;
	@Column(nullable = true)
	protected String distributorInfoUpdated;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="icecat_file_mprod", joinColumns=@JoinColumn(name="file_index_id"))
	protected Set<IcecatFileMprodDao> mProds;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="icecat_file_ean", joinColumns=@JoinColumn(name="file_index_id"))
	protected Set<IcecatFileEanDao> eans;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getCatid() {
		return catid;
	}

	public void setCatid(String catid) {
		this.catid = catid;
	}

	public String getOnMarket() {
		return onMarket;
	}

	public void setOnMarket(String onMarket) {
		this.onMarket = onMarket;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getProductView() {
		return productView;
	}

	public void setProductView(String productView) {
		this.productView = productView;
	}

	public String getHighPic() {
		return highPic;
	}

	public void setHighPic(String highPic) {
		this.highPic = highPic;
	}

	public String getHighPicSize() {
		return highPicSize;
	}

	public void setHighPicSize(String highPicSize) {
		this.highPicSize = highPicSize;
	}

	public String getHighPicWidth() {
		return highPicWidth;
	}

	public void setHighPicWidth(String highPicWidth) {
		this.highPicWidth = highPicWidth;
	}

	public String getHighPicHeight() {
		return highPicHeight;
	}

	public void setHighPicHeight(String highPicHeight) {
		this.highPicHeight = highPicHeight;
	}

	public String getDistributorInfoUpdated() {
		return distributorInfoUpdated;
	}

	public void setDistributorInfoUpdated(String distributorInfoUpdated) {
		this.distributorInfoUpdated = distributorInfoUpdated;
	}

	public Set<IcecatFileMprodDao> getMProds() {
		return mProds;
	}

	public void setMProds(Set<IcecatFileMprodDao> mProds) {
		this.mProds = mProds;
	}

	public Set<IcecatFileEanDao> getEans() {
		return eans;
	}

	public void setEans(Set<IcecatFileEanDao> eans) {
		this.eans = eans;
	}
	
}
