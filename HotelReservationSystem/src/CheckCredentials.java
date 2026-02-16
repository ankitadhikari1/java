import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckCredentials {

	Connection con;
	public CheckCredentials(Connection con) {
		this.con = con;
	}
	
	public boolean check( String email , String pass) throws SQLException {
		
		Statement stmt = con.createStatement();
		String query = "select email , pass from authentication where email = '"+email+"' and password ='"+pass+"';";
		ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {   
            return true;
        }
        
        return false;
	}
	
	
}
