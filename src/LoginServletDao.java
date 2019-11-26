

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class LoginServletDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String  email,pass;
	public LoginServletDao(String a,String b)
	{
		email=a;
		pass=b;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPass()
	{
		return pass;
	}
    public boolean check(String email, String pass) throws ServletException, IOException {

    	Connection con=null; 
    	ResultSet rs =null;
		PreparedStatement st=null;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mail","root","");
			st = con.prepareStatement("select * from employee where email=? and password=?");
			st.setString(1, email);
			st.setString(2, pass);
			rs= st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
	}

}
