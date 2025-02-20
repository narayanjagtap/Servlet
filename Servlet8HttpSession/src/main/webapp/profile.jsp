<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Profile</title>
</head>
<body>
	<%
		String myname = (String) session.getAttribute("name_key");
	%>
	<h3> Welcome : <%= myname %> </h3>
	
	<a href="home.jsp">Home</a> &nbsp; &nbsp; &nbsp; &nbsp;
	<a href="about-us.jsp">About Us</a>&nbsp; &nbsp; &nbsp; &nbsp;
	<a href="logout">LogOut</a>
</body>
</html>