package pa9;

import java.sql.SQLException;
import java.util.List;

public interface AbstractFactory<T> {

	int add(T t)
			throws SQLException;

	void delete(int id)
			throws SQLException;

	T getClass(int id)
			throws SQLException;

	List<T> getClasses()
			throws SQLException;

	void update(T t)
			throws SQLException;
}
