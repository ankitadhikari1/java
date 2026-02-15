import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) {
		
		try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/testdb",
                "root",
                "ankit123"
            );

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO student VALUES(2, 'Java')");

            System.out.println("Connected and Data Inserted");

            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}
