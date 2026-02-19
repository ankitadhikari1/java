import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDb3 {
	static final String url = "jdbc:mysql://127.0.0.1:3306/student";
	static final String user = "root";
	static final String pass = "ankit123";
	static final String file_path = "/Users/ankitadhikari/Desktop/java/JDBCExample/src/image_upload/IMG_4150.JPG";
	static final String query = "insert into image_upload (image_data) values (?)";
	
	public static void main(String[] args) throws SQLException, IOException {
		
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully.....");
		FileInputStream fileinputstream = new FileInputStream(file_path);
		byte[] data = new byte[fileinputstream.available()];
		fileinputstream.read(data);
		PreparedStatement ps = con.prepareStatement(query);
		ps.setBytes(1, data);
		int rowsAff = ps.executeUpdate();
		if(rowsAff>0) {
			System.out.println("file uploaded successfully");
		}
		else {
			System.out.println("something went wrong...");
		}

	}

}
