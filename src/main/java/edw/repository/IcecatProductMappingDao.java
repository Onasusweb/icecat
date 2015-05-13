package edw.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "icecat_product_mapping")
public class IcecatProductMappingDao extends AbstractEntity {

	@Column
	protected String productId;

	@Column
	protected String supplierId;

	@Column
	protected String mapSupplierId;

	@Column
	protected String mProdId;

	@Column
	protected String prodId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getMapSupplierId() {
		return mapSupplierId;
	}

	public void setMapSupplierId(String mapSupplierId) {
		this.mapSupplierId = mapSupplierId;
	}

	public String getmProdId() {
		return mProdId;
	}

	public void setmProdId(String mProdId) {
		this.mProdId = mProdId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

}
