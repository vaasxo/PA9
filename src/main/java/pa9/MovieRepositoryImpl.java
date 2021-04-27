package pa9;

import entity.Movies;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MovieRepositoryImpl implements AbstractRepository<Movies>{

	private final EntityManager em;

	MovieRepositoryImpl(EntityManager em)
	{
		this.em=em;
	}

	@Override
	public void create(Movies movie) {
		if(movie.getId()==0){
			em.persist(movie);
		}
	}

	@Override
	public Movies findById(int id) {
		return em.find(Movies.class, id);
	}

	@Override
	public List<Movies> findByName(String name) {
		TypedQuery<Movies> movies=em.createNamedQuery("findByName",Movies.class);
		movies.setParameter("name",name);
		return movies.getResultList();
	}
}
