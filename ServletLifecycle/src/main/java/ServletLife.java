

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {

	
	static {
		System.out.println("servlet is loaded");
	}
	
	public ServletLife() {
		System.out.println("servlet object is created");
	}
	
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet initialized");
	}

	
	public void destroy() {

	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ervice method to handle request a nd to response back");
	}

}
