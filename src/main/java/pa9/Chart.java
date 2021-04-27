package pa9;

import entity.Movies;

import java.sql.Date;
import java.util.List;

public class Chart {

	private String name;
	private Date creationDate;
	private List<Movies> moviesList;

	public Chart(String name, Date creationDate, List<Movies> moviesList) {
		this.name = name;
		this.creationDate = creationDate;
		this.moviesList = moviesList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Movies> getMoviesList() {
		return moviesList;
	}

	public void setMoviesList(List<Movies> moviesList) {
		this.moviesList = moviesList;
	}

	public void readMoviesByID(int idMax, MovieRepositoryImpl movieRepository){
		for(int i=0;i<=idMax;i++)
		{
			moviesList.add(movieRepository.findById(i));
		}
	}

	public void readMoviesByName(String name, MovieRepositoryImpl movieRepository){
		moviesList=movieRepository.findByName(name);
	}

}
