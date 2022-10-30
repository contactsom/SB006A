<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<h1> The One-Stop Hiring Solution for your Software Development and Data Teams [Using POST]</h1>
	<h2> Interested in hiring from us? </h2>
	<h3> Share your details and we will get in touch. </h3>
	
	<form action="<%= request.getContextPath()%>/hire-from-us" method="post">
	
		First Name : <input type="text" name="firstname"/>
		<br><br>
		Last Name : <input type="text" name="lastname"/>
		<br><br>
		Email ID  : <input type="email" name="emailId"/>
		<br><br>
		Password : <input type="password" name="password"/>
		<br><br>
	
		<tr>
			<td>
				<input type="submit" value ="Become a hiring partner"/>
			</td>
		</tr>
	
	
	</form>
	
	
	
</body>
</html>