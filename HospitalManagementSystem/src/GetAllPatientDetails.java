import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllPatientDetails {

    String query = "select * from patient";

    public void getDetails(JDBCUtility jdbc) throws SQLException {

        Statement stmt = jdbc.getStatement();
        if (stmt == null) {
            System.out.println("Database error");
            return;
        }

        ResultSet rs = stmt.executeQuery(query);

        boolean found = false;

        while (rs.next()) {
            found = true;

            System.out.println("----------------------------------------------------------");

            String name = rs.getString("name");
            String doctorName = rs.getString("doctor");

            Date date = rs.getDate("register_date");
            String dateReg = (date != null) ? date.toString() : "Not Available";

            System.out.println("Patient name : " + name);
            System.out.println("Doctor assigned : " + doctorName);
            System.out.println("Date registered : " + dateReg);

            System.out.println("----------------------------------------------------------");
        }

        if (!found) {
            System.out.println("No patients found in the system.");
        }
    }
}