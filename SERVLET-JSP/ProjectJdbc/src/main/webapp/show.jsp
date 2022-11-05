<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show.jsp</title>
</head>
<body>
	<h1>Congratulation!!! You are registured successfully </h1>
	First Name : <%= request.getAttribute("FNAME") %>
	<br>
	
	Last Name : <%= request.getAttribute("LNAME") %>
	<br>
	
	EMIL ID : <%= request.getAttribute("EMAIL") %>
	<br>
	PASSWORD : <%= request.getAttribute("PASSWORD") %>
	<br>
	
</body>
</html>