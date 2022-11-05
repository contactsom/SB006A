<%@page import="com.simplilearn.beans.Customer" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert.jsp</title>
</head>
<body>
	
		<%
		
			Customer customer = new Customer();
			customer.setCid(202);
			customer.setCname("Pankaj");
			customer.setEmail("pankaj@simplilearn.com");
			customer.setPhone(9876123);
			session.setAttribute("CUST", customer);
			
			
			Customer customer1 = new Customer();
			customer1.setCid(203);
			customer1.setCname("Kunal");
			customer1.setEmail("kunal@simplilearn.com");
			customer1.setPhone(9176123);
			session.setAttribute("CUST1", customer1);
		
		%>

		<jsp:forward page="display.jsp"/>
</body>
</html>