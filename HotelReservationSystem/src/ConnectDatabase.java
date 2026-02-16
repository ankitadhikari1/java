import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//this class help us to connect to database and return the instance

public class ConnectDatabase {

	private Connection  con ;
	
	public Connection getInstance(String url , String username , String pass) throws SQLException {
		if(con==null) {
			con = DriverManager.getConnection(url, username, pass);
		}
		return con;
	}
	
}
