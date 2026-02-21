import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisterDoctor {

    String query = "insert into doctorTable (name,number,profession) values(?,?,?)";

    public void register(Scanner sc, JDBCUtility jdbc) throws SQLException {

        sc.nextLine(); 

        System.out.println("enter doctor name");
        String name = sc.nextLine();

        System.out.println("enter doctor phone number");
        String number = sc.nextLine();

        String type;

        System.out.println("----------------------------------------------------------");
        System.out.println("enter profession of doctor");
        System.out.println("1. neurologist");
        System.out.println("2. physician");
        System.out.println("3. Gastroenterologist");
        System.out.println("4. Pediatrician");
        System.out.println("----------------------------------------------------------");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                type = "neurologist";
                break;
            case 2:
                type = "physician";
                break;
            case 3:
                type = "Gastroenterologist";
                break;
            case 4:
                type = "Pediatrician";
                break;
            default:
                System.out.println("wrong choice physician is assigned");
                type = "physician";
        }

        PreparedStatement ps = jdbc.getPreparedStatement(query);
        if (ps == null) {
            System.out.println("Database error");
            return;
        }

        ps.setString(1, name);
        ps.setString(2, number);
        ps.setString(3, type);

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("registration successful");
        } else {
            System.out.println("something went wrong while registration");
        }
    }
}