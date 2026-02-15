

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control in first Servlet");
		
		RequestDispatcher rd = request.getRequestDispatcher("/SecondServlet");
		rd.forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>this is first servlet</h1>");
		System.out.println("control again in first Servlet");
	}

}
