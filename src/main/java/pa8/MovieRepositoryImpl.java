package pa8;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class MovieRepositoryImpl implements MovieRepository{

	private EntityManager em;

	@Override
	public void create(Movie movie) {
		if(movie.getId()==0){
			em.persist(movie);
		}
	}

	@Override
	public Movie findById(int id) {
		return em.find(Movie.class, id);
	}

	@Override
	public Movie findByName(String name) {
		TypedQuery<Movie> movies=em.createNamedQuery("findByName",Movie.class);
		movies.setParameter("name",name);
		return movies.getSingleResult();
	}
}
