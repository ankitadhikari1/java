import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePatient {

    String query = "delete from patient where number = ?";

    public void deletePatient(Scanner sc, JDBCUtility jdbc) throws SQLException {

        sc.nextLine(); 

        System.out.println("enter patient number");
        String number = sc.nextLine();

        PreparedStatement ps = jdbc.getPreparedStatement(query);
        if (ps == null) {
            System.out.println("Database error");
            return;
        }

        ps.setString(1, number);

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Deletion successful");
        } else {
            System.out.println("Patient not found");
        }
    }
}