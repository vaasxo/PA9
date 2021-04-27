package pa9;

import entity.Movies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.sql.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = EMFactory.getEntityManagerFactory();
		EntityManager em = factory.createEntityManager();

		Movies movie = new Movies();
		Date releaseDate = new Date(2000,7,14);

		movie.setId(123456);
		movie.setTitle("Random Movie");
		movie.setReleaseDate(releaseDate);
		movie.setDuration(120);
		movie.setScore(5.0);

		MovieRepositoryImpl movieRepository = new MovieRepositoryImpl(em);
		movieRepository.create(movie);

		Movies movie2;
		movie2 = movieRepository.findById(123456);
		System.out.println(movie2.getTitle());

		List<Movies> moviesList=movieRepository.findByName("The");
		System.out.println(moviesList);

		Chart chart = new Chart("chart1", releaseDate);
		chart.readMoviesByID(100,movieRepository);
		System.out.println(chart.getMoviesList());

		em.close();
		factory.close();
	}
}
