import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class regServletDao{
	public Boolean insert(int emp,String nam,String ema,String pass) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mail","root","");
		PreparedStatement st = con.prepareStatement("insert into employee values(?,?,?,?)");
		st.setInt(1, emp);
		st.setString(2, nam);
		st.setString(3, ema);
		st.setString(4, pass);
		int i=st.executeUpdate();
		if(i!=0)
		return true;
		return false;
	}
}