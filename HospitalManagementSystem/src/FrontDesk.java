import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class FrontDesk {

    public static void main(String[] args) throws SQLException {

        System.out.print("app is opening");
        int i = 5;
        while (i > 0) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }

        System.out.println();
        System.out.println("trying to connect to database");

        JDBCUtility jdbc = new JDBCUtility();
        Connection con = jdbc.getConnection();

        if (con != null) {
            System.out.println("connected to database successfully");
        } else {
            System.out.println("connection failed");
            return; 
        }

        Scanner sc = new Scanner(System.in); 

        while (true) {

            System.out.println("----------------------------------------------------------");
            System.out.println("Choose an option from below");
            System.out.println("1. Register patient");
            System.out.println("2. Get patient details");
            System.out.println("3. Get all patient");
            System.out.println("4. Delete patient");
            System.out.println("5. Register doctor");
            System.out.println("6. Quit");
            System.out.println("----------------------------------------------------------");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    new RegisterPatient().register(sc, jdbc);
                    break;
                case 2:
                    new GetPatientDetails().getDetails(sc, jdbc);
                    break;
                case 3:
                    new GetAllPatientDetails().getDetails(jdbc);
                    break;
                case 4:
                    new DeletePatient().deletePatient(sc, jdbc);
                    break;
                case 5:
                    new RegisterDoctor().register(sc, jdbc);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    jdbc.closeConnection();
                    return;
                default:
                    System.out.println("Wrong option selected. Try again.");
            }
        }
    }
}