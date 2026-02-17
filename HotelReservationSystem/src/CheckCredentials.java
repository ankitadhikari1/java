import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckCredentials {

    Connection con;

    public CheckCredentials(Connection con) {
        this.con = con;
    }

    public boolean check(String email, String pass) throws SQLException {

        String query = "SELECT 1 FROM authentication WHERE email = ? AND password = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, pass);

        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
}