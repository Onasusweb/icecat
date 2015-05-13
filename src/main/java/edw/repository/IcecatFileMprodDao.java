package edw.repository;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IcecatFileMprodDao {

	@Column(nullable = true)
	protected String mprodId;

	@Column(nullable = true)
	protected String supplierId;

	@Column(nullable = true)
	protected String supplierName;

	public String getMprodId() {
		return mprodId;
	}

	public void setMprodId(String mprodId) {
		this.mprodId = mprodId;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
}
