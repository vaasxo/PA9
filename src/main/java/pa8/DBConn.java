package pa8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static Connection conn = null;

	private DBConn(){}

	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "STUDENT";
		String pass = "STUDENT";
		try {
			conn = DriverManager.getConnection(url, user, pass);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		return conn;
	}

}
