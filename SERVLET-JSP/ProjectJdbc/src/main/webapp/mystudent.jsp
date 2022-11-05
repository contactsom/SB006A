<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simplilearn Registration Form</title>
</head>
<body>

	<form action="<%= request.getContextPath()%>/insert" method="post">
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
				<input type="submit" value ="Register"/>
			</td>
		</tr>
	</form>


	<form action="<%= request.getContextPath()%>/search" method="post">
		Email ID  : <input type="email" name="emailId"/>
		<br><br>
		<tr>
			<td>
				<input type="submit" value ="Search"/>
			</td>
		</tr>
	</form>
	
</body>
</html>