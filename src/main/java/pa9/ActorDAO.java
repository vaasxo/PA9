package pa9;

import java.sql.SQLException;
import java.util.List;

public interface ActorDAO {

	int add(Actor actor)
			throws SQLException;

	void delete(int id)
			throws SQLException;

	Actor getActor(int id)
			throws SQLException;

	List<Actor> getActors()
			throws SQLException;

	void update(Actor actor)
			throws SQLException;
}
