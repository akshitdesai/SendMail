

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class indexServlet
 */
@WebServlet("/indexServlet")
public class indexServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String to = request.getParameter("to");
		String sub = request.getParameter("sub");
		String mes = request.getParameter("mes");
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String pass = request.getParameter("pass");
		String image=request.getParameter("image");
		if(image.trim()=="")
			image="-";
		if(image=="-")
		System.out.println("--adfad--"+image+"dafa--");
		indexDao.send(to,sub,mes,email,pass,image);
		System.out.println("Successfully sent");
	
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
