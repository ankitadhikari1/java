import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtility {

    private String url = "jdbc:mysql://127.0.0.1:3306/hospital";
    private String user = "root";
    private String pass = "ankit123";

    private Connection con = null;

    public Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(url, user, pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public PreparedStatement getPreparedStatement(String query) {
        try {
            return getConnection().prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Statement getStatement() {
        try {
            return getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}