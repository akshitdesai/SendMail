<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%response.setHeader("cahce-control","no-cache, no-store, must-revalidate"); %>
<form action="LoginServlet">
     
	<strong style="font-size:30px;margin:300px">Login</strong><br>
	<table  border="2px" width="30%">
	<tr>
	<td width="25%">Email </td>
	<td><input type="email" name="email1" size="100"></td>
	</tr>
	<tr>
	<td width="25%">Password  </td>
	<td><input type="password" name="password1" size="100"></td>
	</tr>
	</table>
	<br>
	<center><input type="submit" value="Login" style="background-color:#06fae7"></center>
	<br>
	</form>
	<center><input type="submit" onclick="window.location='register.jsp'" value="register" style="background-color:#06fae7"></center>


</body>
</html>