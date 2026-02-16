
import java.sql.*;


public class TestDB2 {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://127.0.0.1:3306/testdb";
		String user = "root";
		String pass = "ankit123";
		String query = "select * from student";
		
		
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("application connected to database");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			System.out.println("...............................");
			System.out.println("id :"+id+" Name :"+name);
		}
		
		
		stmt.close();
		con.close();
		rs.close();
		
	}

}
