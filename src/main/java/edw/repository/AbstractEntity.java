package edw.repository;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

@MappedSuperclass
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@Version
	private int version;

	@PrePersist
	void createdAt() {
		this.setCreatedAt(this.setUpdatedAt(new Date()));
	}

	@PreUpdate
	void updatedAt() {
		this.setUpdatedAt(new Date());
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
			return false;
		}

		AbstractEntity that = (AbstractEntity) obj;

		return this.id.equals(that.getId());
	}

	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Date setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
		return updatedAt;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
