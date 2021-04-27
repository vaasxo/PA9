package pa9;

import java.sql.Date;

public class Director {

	private int id;
	private String name;
	private Date birthdate;

	public Director(){}

	public Director(int id, String name, Date birthdate) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Director{" +
				"id=" + id +
				", name='" + name + '\'' +
				", birthdate=" + birthdate +
				'}';
	}
}
