import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/hotel_db";
    private static final String USER = "root";
    private static final String PASSWORD = "ankit123";

    public static void main(String[] args) {

        System.out.println("Welcome to application...");
        System.out.println("Enter login credentials");

        try (
            Scanner sc = new Scanner(System.in);
            Connection con = new ConnectDatabase().getInstance(URL, USER, PASSWORD)
        ) {

            CheckCredentials chk = new CheckCredentials(con);

            // Login loop
            while (true) {
                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter password: ");
                String passwordInput = sc.nextLine();

                if (chk.check(email, passwordInput)) {
                    System.out.println("Login successful");
                    break;
                }

                System.out.println("Wrong email or password. Try again.");
            }

            Hotel hotel = new Hotel(con);

            boolean running = true;

            while (running) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Reserve a room");
                System.out.println("2. Check reservation");
                System.out.println("3. Update a reservation");
                System.out.println("4. Delete reservation");
                System.out.println("5. Get all bookings");
                System.out.println("6. Exit application");

                System.out.print("Enter choice: ");
                
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Enter a number.");
                    sc.nextLine();
                    continue;
                }

                int choice = sc.nextInt();
                sc.nextLine();  

                switch (choice) {
                    case 1:
                        hotel.reserveRoom(sc);
                        break;
                    case 2:
                        hotel.checkReservation(sc);
                        break;
                    case 3:
                        hotel.updateReservation(sc);
                        break;
                    case 4:
                        hotel.deleteReservation(sc);
                        break;
                    case 5:
                        hotel.getAllBookings();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Exiting application...");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}