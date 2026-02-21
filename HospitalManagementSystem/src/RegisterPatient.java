import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisterPatient {

    String query1 = "select * from doctorTable where profession = ?";
    String query2 = "insert into patient (name,age,number,doctor) values(?,?,?,?)";

    public void register(Scanner sc, JDBCUtility jdbc) throws SQLException {

        System.out.println("enter patient name");
        sc.nextLine(); 
        String name = sc.nextLine();

        System.out.println("enter patient age");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("enter patient phone number");
        String number = sc.nextLine();

        String type;

        System.out.println("----------------------------------------------------------");
        System.out.println("enter choice of doctor");
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

        PreparedStatement ps = jdbc.getPreparedStatement(query1);
        if (ps == null) {
            System.out.println("Database error");
            return;
        }

        ps.setString(1, type);
        ResultSet rs = ps.executeQuery();

        int i = 1;
        while (rs.next()) {
            String docName = rs.getString("name");
            System.out.println(i + " " + docName);
            i++;
        }

        System.out.println("enter doctor name");
        String doctor = sc.nextLine();

        PreparedStatement ps2 = jdbc.getPreparedStatement(query2);
        if (ps2 == null) {
            System.out.println("Database error");
            return;
        }

        ps2.setString(1, name);
        ps2.setInt(2, age);
        ps2.setString(3, number);
        ps2.setString(4, doctor);

        int rowsAffected = ps2.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("registration successful");
        } else {
            System.out.println("something went wrong while registration");
        }
    }
}