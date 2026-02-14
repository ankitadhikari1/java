

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class firstServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public firstServletApp() {
		System.out.println("servlet is created");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	        throws ServletException, IOException {

	    String name = request.getParameter("uname");
	    String city = request.getParameter("ucity");

	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();

	    writer.println("<!DOCTYPE html>");
	    writer.println("<html>");
	    writer.println("<head>");
	    writer.println("<meta charset='UTF-8'>");
	    writer.println("<title>Welcome</title>");
	    writer.println("<style>");
	    writer.println("* { margin:0; padding:0; box-sizing:border-box; font-family:Arial, sans-serif; }");
	    writer.println("body { height:100vh; display:flex; justify-content:center; align-items:center;");
	    writer.println("background: linear-gradient(135deg, #4e73df, #1cc88a); }");
	    writer.println(".card { background:white; padding:40px; width:400px;");
	    writer.println("border-radius:15px; box-shadow:0 15px 35px rgba(0,0,0,0.2); text-align:center; }");
	    writer.println("h1 { color:#333; margin-bottom:15px; }");
	    writer.println("p { font-size:18px; color:#555; margin-bottom:25px; }");
	    writer.println(".btn { display:inline-block; padding:10px 20px;");
	    writer.println("background:#4e73df; color:white; text-decoration:none;");
	    writer.println("border-radius:8px; transition:0.3s; }");
	    writer.println(".btn:hover { background:#2e59d9; }");
	    writer.println("</style>");
	    writer.println("</head>");
	    writer.println("<body>");

	    writer.println("<div class='card'>");
	    writer.println("<h1>Welcome, " + name + "!</h1>");
	    writer.println("<p>Nice to meet someone from <b>" + city + "</b>.</p>");
	    writer.println("<a href='index.html' class='btn'>Go Back</a>");
	    writer.println("</div>");

	    writer.println("</body>");
	    writer.println("</html>");

	    writer.close();
	}

}
