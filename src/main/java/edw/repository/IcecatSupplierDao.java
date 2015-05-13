package edw.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "icecat_supplier")
public class IcecatSupplierDao extends AbstractEntity {

	@Column
	protected String icecatSupplierId;

	@Column
	protected String name;
	
	@Column
	private String logoPic;
	
	public String getIcecatSupplierId() {
		return icecatSupplierId;
	}
	public void setIcecatSupplierId(String icecatSupplierId) {
		this.icecatSupplierId = icecatSupplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogoPic() {
		return logoPic;
	}
	public void setLogoPic(String logoPic) {
		this.logoPic = logoPic;
	}
	
}
