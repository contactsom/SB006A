<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tutorials</title>
</head>
<body>

		<h1> This is First JSP Tutorials </h1>
		<h2> JSP Decleration Using Declerative Tag</h2>
		
		
		<%!
			int a=10;
			int b=20;
			String course="JSP Tutorials";
		
			public int addNum(){
				return a+b;
			}
		
			public String getCourse(){
				return course;
			}
		%>
		
		
		<h2> ************ JSP Calling JAVA Code Using Scriptlet Tag ************ </h2>
		
		<%
			out.print(a);
			out.print("<br>");
			out.print(b);
			out.print("<br>");
			out.print(addNum());
			out.print("<br>");
			out.print(getCourse());
			out.print("<br>");
		%>
		
		<h2> ************ JSP Calling JAVA Code Using JSP Expression Tag ************ </h2>
		
		<%= a %>
		<br>
		<%= b %>
		<br>
		<%= addNum() %>
		<br>
		<%= getCourse() %>
		<br>
		
</body>
</html>