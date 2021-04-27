package pa8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class DirectorDAOImplementation implements AbstractFactory<Director> {

	static Connection conn = DBConn.getConnection();

	@Override
	public int add(Director director) throws SQLException {

		String query = "insert into DIRECTORS(ID, NAME, BIRTHDATE) VALUES (?,?,?)";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setInt(1, director.getId());
		ps.setString(2, director.getName());
		ps.setDate(3, director.getBirthdate());

		int result=ps.executeUpdate();
		ps.close();

		return result;
	}

	@Override
	public void delete(int id) throws SQLException {

		String query = "delete from DIRECTORS where ID =?";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setInt(1, id);

		ps.executeUpdate();
		ps.close();

	}

	@Override
	public Director getClass(int id) throws SQLException {

		String query = "select * from DIRECTORS where ID= ?";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		Director director = new Director();
		boolean check = false;

		if (rs.next()) {
			check = true;
			director.setId(rs.getInt("id"));
			director.setName(rs.getString("name"));
			director.setBirthdate(rs.getDate("birthdate"));
		}

		rs.close();
		ps.close();

		if (check) {
			return director;
		} else
			return null;
	}

	@Override
	public List<Director> getClasses() throws SQLException {

		String query = "select * from DIRECTORS";

		PreparedStatement ps = conn.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		List<Director> ls = new Vector<>();

		while (rs.next()) {
			Director director = new Director();
			director.setId(rs.getInt("id"));
			director.setName(rs.getString("name"));
			director.setBirthdate(rs.getDate("birthdate"));
			ls.add(director);
		}

		rs.close();
		ps.close();

		return ls;
	}

	@Override
	public void update(Director director) throws SQLException {

		String query = "update DIRECTORS set NAME= ?, BIRTHDATE=? where ID = ?";

		PreparedStatement ps = conn.prepareStatement(query);

		ps.setString(1, director.getName());
		ps.setDate(2, director.getBirthdate());
		ps.setInt(3, director.getId());

		ps.executeUpdate();
		ps.close();
	}
}
