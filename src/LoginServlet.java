

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email1");
		String pass = request.getParameter("password1");
		LoginServletDao l1= new LoginServletDao(email,pass);
		
		if(l1.check(email,pass))
		{
			HttpSession session  = request.getSession();
			session.setAttribute("email",l1.getEmail());
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
	}
}
