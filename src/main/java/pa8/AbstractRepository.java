package pa8;

import java.util.List;

public interface AbstractRepository<T> {

	void create(T t);

	T findById(int id);

	List<T> findByName(String name);
}
