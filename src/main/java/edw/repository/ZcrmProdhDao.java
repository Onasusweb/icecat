package edw.repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "zcrmprodh")
public class ZcrmProdhDao extends AbstractEntity {

    protected String spras;
    protected String prodh;
	protected String vtext;
    
    public String getSpras() {
		return spras;
	}
	public void setSpras(String spras) {
		this.spras = spras;
	}
	public String getProdh() {
		return prodh;
	}
	public void setProdh(String prodh) {
		this.prodh = prodh;
	}
	public String getVtext() {
		return vtext;
	}
	public void setVtext(String vtext) {
		this.vtext = vtext;
	}

}
