import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
	
	
	private static final String url = "jdbc:mysql://127.0.0.1:3306/hotel_db";
	private static final String user = "root";
	private static final String pass = "ankit123";
	

	public static void main(String[] args) throws SQLException {
		
		
		System.out.println("welcome to application.....");
		System.out.println("Enter login credentials");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		ConnectDatabase obj = new ConnectDatabase();
		Connection con = obj.getInstance(url, user, pass);
		
		
		CheckCredentials chk = new CheckCredentials(con);
		
		
		while(true) {
		
			System.out.println("enter email");
			String email = sc.nextLine();
			System.out.println("enter password");
			String pass = sc.nextLine();
		
			if(chk.check(email, pass)==true) {
				break;
			}
			
			System.out.println("wrong email or password enter again...");
			
		}
		
		
		System.out.println("entered in applcaition");
		
		
		
		
		
		
	}

}
