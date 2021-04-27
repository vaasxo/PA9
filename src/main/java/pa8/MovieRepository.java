package pa8;

import entity.Movies;

import java.util.List;

public interface MovieRepository {

	void create(Movies movie);

	Movies findById(int id);

	List<Movies> findByName(String name);

}
