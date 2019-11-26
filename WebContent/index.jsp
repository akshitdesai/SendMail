<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("cahce-control","no-cache, no-store, must-revalidate");
		String s=(String)session.getAttribute("email");
		System.out.println(s);
		/*if(s==null)
		{
			response.sendRedirect("Login.jsp");
		}*/
	%>
	<center><strong style="font-size:30px">Mail</strong></center>
	<form action="indexServlet">
	<table border="2px" width="100%" id="tbl">
	<tr>
	<td width="25%">To</td>
	<td><input type="text" name="to" size="100"></td>
	</tr>
	<tr>
	<td width="25%">Subject</td>
	<td><input type="text" name="sub"  size="100"></td>
	</tr>
	<tr>
	<td width="25%">Message</td>
	<td><input type="text" name="mes" size="100"></td>
	</tr>
	<tr>
	<td width="25%">Pass</td>
	<td><input type="password" name="pass" size="100"></td>
	</tr>
	<tr>
	<td width="25%">Image\Pdf</td>
	<td><input type="file" name="image" size="50"></td>
	</tr>
	</table>
	<br>
	<center><input type="submit" value="submit" style="background-color:#06fae7"></center>
	<br>
	</form>
	<form action="LogoutServlet">
	<center><input type="submit" value="Logout" style="background-color:#06fae7"></center>
	</form>
</body>
</html>