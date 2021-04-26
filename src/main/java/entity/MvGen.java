package entity;

import javax.persistence.*;

@Entity
@Table(name = "MV_GEN", schema = "STUDENT")
@IdClass(MvGenPK.class)
public class MvGen {
	private int mvId;
	private int genId;

	@Id
	@Column(name = "MV_ID")
	public int getMvId() {
		return mvId;
	}

	public void setMvId(int mvId) {
		this.mvId = mvId;
	}

	@Id
	@Column(name = "GEN_ID")
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

		MvGen mvGen = (MvGen) o;

		if (mvId != mvGen.mvId) return false;
		return genId == mvGen.genId;
	}

	@Override
	public int hashCode() {
		int result = mvId;
		result = 31 * result + genId;
		return result;
	}
}
