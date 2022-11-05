<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SimpliEat-HOME</title>
</head>
<body>

	<jsp:include page="header.jsp">
		<jsp:param value="SimpliEat - Solution for all Kinds of Food" name="header"/>
	</jsp:include>
	
	<h2> Discover the best food & drinks at SimpliEat</h2>
			
	
	<h3> Select Your favourite Food Delivery Partners</h3>
	
	<form action="service.jsp">
	
		<select name="deliverypartners">
			<option value="zomato"> Zomato </option>
			<option value="swiggy"> Swiggy </option>
			<option value="travelkhana"> Travelkhana </option>
			<option value="freshmenu"> FreshMenu </option>
		</select>
		
		<input type="submit" value="Submit"/>
	
	</form>
	
	
	<jsp:include page="footer.jsp">
		<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © SimpliEat™ Ltd. All rights reserved." name="footer"/>
	</jsp:include>
	
</body>
</html>