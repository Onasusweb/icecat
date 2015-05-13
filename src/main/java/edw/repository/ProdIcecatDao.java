package edw.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prod_icecat")
public class ProdIcecatDao {

	@Id
	protected String partn;
	@Column(nullable = true)
	protected String brand;
	@Column(nullable = true)
	protected String quality;
	@Column(nullable = true)
	protected String category;
	@Column(nullable = true)
	protected String model;
	@Column(nullable = true)
	protected String ean;
	@Column(nullable = true)
	protected String market_presence;
	@Column(nullable = true)
	protected String family;
	@Column(nullable = true)
	protected String title;
	public String getPartn() {
		return partn;
	}
	public void setPartn(String partn) {
		this.partn = partn;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getMarket_presence() {
		return market_presence;
	}
	public void setMarket_presence(String market_presence) {
		this.market_presence = market_presence;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
