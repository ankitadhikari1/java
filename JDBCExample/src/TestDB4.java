import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB4 {
	static final String url = "jdbc:mysql://127.0.0.1:3306/student";
	static final String user = "root";
	static final String pass = "ankit123";
	static final String folder_path = "/Users/ankitadhikari/Desktop/java/JDBCExample/src/image_download";
	static final String query = "select * from image_upload where image_id = (?)";
	
	public static void main(String[] args) throws SQLException, IOException {
		
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection established successfully.....");
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 1);
		ResultSet st = ps.executeQuery();
		if(st.next()) {
			byte[] data = st.getBytes("image_data");
			String image_path = folder_path + "image1.jpg";
			OutputStream os = new FileOutputStream(image_path);
			os.write(data);
			System.out.println("file downloaded successfully..");
			
		}
		else {
			System.out.println("no file found");
		}
		

	}

}
