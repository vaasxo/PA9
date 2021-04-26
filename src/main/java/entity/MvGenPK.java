package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MvGenPK implements Serializable {
	private int mvId;
	private int genId;

	@Column(name = "MV_ID")
	@Id
	public int getMvId() {
		return mvId;
	}

	public void setMvId(int mvId) {
		this.mvId = mvId;
	}

	@Column(name = "GEN_ID")
	@Id
	public int getGenId() {
		return genId;
	}

	public void setGenId(int genId) {
		this.genId = genId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MvGenPK mvGenPK = (MvGenPK) o;

		if (mvId != mvGenPK.mvId) return false;
		return genId == mvGenPK.genId;
	}

	@Override
	public int hashCode() {
		int result = mvId;
		result = 31 * result + genId;
		return result;
	}
}
