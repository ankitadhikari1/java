import java.sql.*;
import java.util.Scanner;

public class Hotel {

    Connection con;

    public Hotel(Connection con) {
        this.con = con;
    }

    public void reserveRoom(Scanner sc) throws SQLException {

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter phone number:");
        String number = sc.nextLine();

        System.out.println("Enter room number:");
        int roomNum = sc.nextInt();
        sc.nextLine();

        String query = "INSERT INTO reservations (guest_name, room_number, contact_number) VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, roomNum);
        ps.setString(3, number);

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Reservation done successfully.");
        } else {
            System.out.println("Reservation failed.");
        }
    }

    public void checkReservation(Scanner sc) throws SQLException {

        System.out.println("Enter phone number:");
        String num = sc.nextLine();

        String query = "SELECT guest_name, room_number, reservation_date FROM reservations WHERE contact_number = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, num);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Name: " + rs.getString("guest_name"));
            System.out.println("Room Number: " + rs.getInt("room_number"));
            System.out.println("Reservation Date: " + rs.getDate("reservation_date"));
        } else {
            System.out.println("No reservation found.");
        }
    }

    public boolean reservationExist(String number) throws SQLException {

        String query = "SELECT 1 FROM reservations WHERE contact_number = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, number);

        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public void updateReservation(Scanner sc) throws SQLException {

        System.out.println("Enter phone number:");
        String oldNumber = sc.nextLine();

        if (!reservationExist(oldNumber)) {
            System.out.println("No reservation exists.");
            return;
        }

        System.out.println("Enter new name:");
        String name = sc.nextLine();

        System.out.println("Enter new contact number:");
        String newNumber = sc.nextLine();

        System.out.println("Enter new room number:");
        int roomNum = sc.nextInt();
        sc.nextLine();

        String query = "UPDATE reservations SET guest_name = ?, room_number = ?, contact_number = ? WHERE contact_number = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, roomNum);
        ps.setString(3, newNumber);
        ps.setString(4, oldNumber);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Reservation updated successfully.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public void deleteReservation(Scanner sc) throws SQLException {

        System.out.println("Enter phone number:");
        String number = sc.nextLine();

        if (!reservationExist(number)) {
            System.out.println("No reservation exists.");
            return;
        }

        String query = "DELETE FROM reservations WHERE contact_number = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, number);

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Reservation deleted successfully.");
        } else {
            System.out.println("Deletion failed.");
        }
    }

    public void getAllBookings() throws SQLException {

        String query = "SELECT * FROM reservations";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("Name: " + rs.getString("guest_name"));
            System.out.println("Contact: " + rs.getString("contact_number"));
            System.out.println("Room: " + rs.getInt("room_number"));
            System.out.println("Date: " + rs.getDate("reservation_date"));
            System.out.println("------------------------------");
        }
    }
}