package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MV_ACT_DIR", schema = "STUDENT")
public class MvActDir {
	private int mvId;

	@Id
	@Column(name = "MV_ID")
	public int getMvId() {
		return mvId;
	}

	public void setMvId(int mvId) {
		this.mvId = mvId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MvActDir mvActDir = (MvActDir) o;

		return mvId == mvActDir.mvId;
	}

	@Override
	public int hashCode() {
		return mvId;
	}
}
