package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@org.hibernate.annotations.NamedQuery(name="findByName", query="SELECT id FROM Movies WHERE title = :name")

@Entity
public class Movies {
	private int id;
	private String title;
	private Date releaseDate;
	private int duration;
	private Double score;
	private String actorsNames;
	private String directorsNames;

	@Id
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "TITLE")

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Basic
	@Column(name = "RELEASE_DATE")
	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Basic
	@Column(name = "DURATION")
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Basic
	@Column(name = "SCORE")
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Basic
	@Column(name = "ACTORS_NAMES")
	public String getActorsNames() {
		return actorsNames;
	}

	public void setActorsNames(String actorsNames) {
		this.actorsNames = actorsNames;
	}

	@Basic
	@Column(name = "DIRECTORS_NAMES")
	public String getDirectorsNames() {
		return directorsNames;
	}

	public void setDirectorsNames(String directorsNames) {
		this.directorsNames = directorsNames;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Movies movies = (Movies) o;

		if (id != movies.id) return false;
		if (duration != movies.duration) return false;
		if (!Objects.equals(title, movies.title)) return false;
		if (!Objects.equals(releaseDate, movies.releaseDate)) return false;
		if (!Objects.equals(score, movies.score)) return false;
		if (!Objects.equals(actorsNames, movies.actorsNames)) return false;
		return Objects.equals(directorsNames, movies.directorsNames);
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
		result = 31 * result + duration;
		result = 31 * result + (score != null ? score.hashCode() : 0);
		result = 31 * result + (actorsNames != null ? actorsNames.hashCode() : 0);
		result = 31 * result + (directorsNames != null ? directorsNames.hashCode() : 0);
		return result;
	}
}
