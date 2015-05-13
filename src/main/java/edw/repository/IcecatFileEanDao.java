package edw.repository;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IcecatFileEanDao {

	@Column(nullable = false)
	protected String ean;

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	
}
