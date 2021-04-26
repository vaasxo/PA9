package pa8;

import java.sql.Date;


public class Movie {

	private int id;
	private double score;
	private String title;
	private Date releaseDate;
	private int duration;

	public Movie() {}

	public Movie(int id, String title, Date releaseDate, int duration, double score) {
		this.id = id;
		this.score = score;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", score=" + score +
				", title='" + title + '\'' +
				", releaseDate=" + releaseDate +
				", duration=" + duration +
				'}';
	}

}
