<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SimpliEat-Service</title>
</head>
<body>
	<h1>SimpliEat-Service</h1>
	
	<%
		String deliverypartner=request.getParameter("deliverypartners");
		
		if(deliverypartner.equalsIgnoreCase("zomato")){
		
	%>
		
		<jsp:forward page="zomato.jsp">
			<jsp:param value="https://www.zomato.com/" name="URL"/>
			<jsp:param value="contact@zomato.com" name="HELP"/>
		</jsp:forward>
	
	<%
	
		}else if(deliverypartner.equalsIgnoreCase("swiggy")){
	
	%>
	
		<jsp:forward page="swiggy.jsp">
			<jsp:param value="https://www.swiggy.com/" name="URL"/>
			<jsp:param value="contact@swiggy.com" name="HELP"/>
		</jsp:forward>
	
	<%
	
		}else if(deliverypartner.equalsIgnoreCase("Travelkhana")){
	
	%>
	
		<jsp:forward page="travelkhana.jsp">
			<jsp:param value="https://www.travelkhana.com/" name="URL"/>
			<jsp:param value="contact@travelkhana.com" name="HELP"/>
		</jsp:forward>
		
	
	<%
	
		}else if(deliverypartner.equalsIgnoreCase("freshmenu")){
	
	%>
	
		<jsp:forward page="freshmenu.jsp">
			<jsp:param value="https://www.freshmenu.com/" name="URL"/>
			<jsp:param value="contact@freshmenu.com" name="HELP"/>
		</jsp:forward>
		
	<%
	
		}
	
	%>
</body>
</html>