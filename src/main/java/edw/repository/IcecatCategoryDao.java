package edw.repository;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
@Table(name = "icecat_category")
public class IcecatCategoryDao extends AbstractEntity {

	@Column(nullable = false)
	protected String categoryId;

	@Column(nullable = true)
	protected String LowPic;
	
	@Column(nullable = true)
	protected String thumbPic;
	
	@Column(nullable = true)
	protected IcecatCategoryDao unCatId;
	
	@Column(nullable = false)
	protected String name;
	
	@Column(nullable = true, length = 60000)
	protected String description;
	
	@Column(nullable = true, length = 60000)
	protected String keywords;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parentId")
	public IcecatCategoryDao parentCategory;
}
