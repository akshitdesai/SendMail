

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regServlet
 */
@WebServlet("/regServlet")
public class regServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id;
		String name,email,pass;                                              
		regServletDao r1= new regServletDao();
		Boolean check=false;
		int i=0,j=0,k=0;
		try {
			id=Integer.parseInt(request.getParameter("id"));
			name= request.getParameter("name");
			email=request.getParameter("email");
			pass =request.getParameter("password");
			check= r1.insert(id,name,email,pass);
			
		} catch (Exception e) {
			i++;
			
		}
		if(check)
		{
			j++;
			response.sendRedirect("Login.jsp");
		}
		else if(i==0&&check==false)
		{
			response.sendRedirect("register.jsp");
		}
		else
		{
			response.sendRedirect("Error.jsp");
		}
	}

}
