package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Actors {
	private int id;
	private String name;
	private Time birthdate;

	@Id
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "BIRTHDATE")
	public Time getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Time birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Actors actors = (Actors) o;

		if (id != actors.id) return false;
		if (!Objects.equals(name, actors.name)) return false;
		return Objects.equals(birthdate, actors.birthdate);
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
		return result;
	}
}
