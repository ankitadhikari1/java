import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetPatientDetails {

    String query = "select * from patient where number = ?";

    public void getDetails(Scanner sc, JDBCUtility jdbc) throws SQLException {

        sc.nextLine(); 

        System.out.println("enter patient phone number");
        String number = sc.nextLine();

        PreparedStatement ps = jdbc.getPreparedStatement(query);
        if (ps == null) {
            System.out.println("Database error");
            return;
        }

        ps.setString(1, number);
        ResultSet rs = ps.executeQuery();

        System.out.println("----------------------------------------------------------");

        if (rs.next()) {
            String name = rs.getString("name");
            String doctorName = rs.getString("doctor");

            java.sql.Date date = rs.getDate("register_date");
            String dateReg = (date != null) ? date.toString() : "Not Available";

            System.out.println("Patient name : " + name);
            System.out.println("Doctor assigned : " + doctorName);
            System.out.println("Date registered : " + dateReg);
        } else {
            System.out.println("Patient does not exist");
        }

        System.out.println("----------------------------------------------------------");
    }
}