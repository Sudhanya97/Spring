<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	${logonerror}
	<form action="login" method="get">
		<input type="text" name="username" placeholder="Enter your name">
		<input type="password" name="password" placeholder="Enter your password">
		<input type="submit" value="login">
	</form>
</body>
</html>