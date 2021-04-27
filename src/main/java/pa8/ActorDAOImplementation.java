package pa8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class ActorDAOImplementation implements ActorDAO {

	static Connection conn = DBConn.getConnection();

	@Override
	public int add(Actor actor) throws SQLException {

		String query = "insert into ACTORS(ID, NAME, BIRTHDATE) VALUES (?,?,?)";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setInt(1, actor.getId());
		ps.setString(2, actor.getName());
		ps.setDate(3, actor.getBirthdate());

		int result = ps.executeUpdate();
		ps.close();

		return result;
	}

	@Override
	public void delete(int id) throws SQLException {

		String query = "delete from ACTORS where ID =?";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setInt(1, id);

		ps.executeUpdate();
		ps.close();

	}

	@Override
	public Actor getActor(int id) throws SQLException {

		String query = "select * from ACTORS where ID= ?";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery();

		Actor actor = new Actor();
		boolean check = false;

		if (rs.next()) {
			check = true;
			actor.setId(rs.getInt("id"));
			actor.setName(rs.getString("name"));
			actor.setBirthdate(rs.getDate("birthdate"));
		}

		rs.close();
		ps.close();

		if (check) {
			return actor;
		} else
			return null;
	}

	@Override
	public List<Actor> getActors() throws SQLException {

		String query = "select * from ACTORS";

		PreparedStatement ps = conn.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		List<Actor> ls = new Vector<>();

		while (rs.next()) {
			Actor actor = new Actor();
			actor.setId(rs.getInt("id"));
			actor.setName(rs.getString("name"));
			actor.setBirthdate(rs.getDate("birthdate"));
			ls.add(actor);
		}

		rs.close();
		ps.close();

		return ls;
	}

	@Override
	public void update(Actor actor) throws SQLException {

		String query = "update ACTORS set NAME= ?, BIRTHDATE=? where ID = ?";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setString(1, actor.getName());
		ps.setDate(2, actor.getBirthdate());
		ps.setInt(3, actor.getId());

		ps.executeUpdate();
		ps.close();
	}
}
