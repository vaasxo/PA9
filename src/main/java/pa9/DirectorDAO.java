package pa9;

import java.sql.SQLException;
import java.util.List;

public interface DirectorDAO {

	int add(Director director)
			throws SQLException;

	void delete(int id)
			throws SQLException;

	Director getDirector(int id)
			throws SQLException;

	List<Director> getDirectors()
			throws SQLException;

	void update(Director director)
			throws SQLException;
}
