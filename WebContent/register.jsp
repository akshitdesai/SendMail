<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<strong style="font-size:30px;margin:250px">Registration Form</strong><br>
	<form action="regServlet" method="post">
	<table border="2px" width="50%">
	<tr>
	<td width="25%">Emp. Id</td>
	<td><input type="text" name="id" size="100"></td>
	</tr>
	<tr>
	<td width="25%">Name</td>
	<td><input type="text" name="name" size="100"></td>
	</tr>
	<tr>
	<td width="25%">Email</td>
	<td><input type="email" name="email" size="100" height="100%"></td>
	</tr>
	<tr>
	<td width="25%">Password</td>
	<td><input type="password" name="password" size="100"></td>
	</tr>
	</table>
	<br>
	<center><input type="submit" value="submit" size="300px" style="background-color: #06fae7 "></center>
	
	<center><a href="Login.jsp">have an account?</a></center>
	</form>
</body>
</html>