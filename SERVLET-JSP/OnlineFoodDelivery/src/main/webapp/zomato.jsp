<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ZOMATO-HOME</title>
</head>
<body>

	<jsp:include page="header.jsp">
		<jsp:param value="Zomato!!! - Every Meal matters " name="header"/>
	</jsp:include>
	
	<h1> Welcome to ZOMATO </h1>
	<h2> Zomato is, without a doubt, one of the best online food delivery apps in India</h2>
	
	
	<h3>  Click on the URL to Redirect on our Poratl ${param.URL} </h3> 
	<h3> For any Query please reach out to this email ID ${param.HELP} </h3> 
	
	<jsp:include page="footer.jsp">
		<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Zomato™ Ltd. All rights reserved." name="footer"/>
	</jsp:include>
	
</body>
</html>