package pa8;

public interface MovieRepository {

	void create(Movie movie);

	Movie findById(int id);

	Movie findByName(String name);

}
