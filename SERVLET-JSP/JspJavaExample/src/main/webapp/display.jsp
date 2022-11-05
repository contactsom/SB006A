<%@page import="com.simplilearn.beans.Customer" %>
<html>
<head>
<meta charset="UTF-8">
<title>Display.jsp</title>
</head>
<body>

		<%
			Object obj = session.getAttribute("CUST");
			Customer customer=null;
			
			if(obj!=null){
				customer=(Customer)obj;
			}
			
			
			Object obj1 = session.getAttribute("CUST1");
			Customer customer1=null;
			
			if(obj1!=null){
				customer1=(Customer)obj1;
			}
		%>
		
		
		<h2> ID : <%= customer.getCid() %> </h2>
		<h2> NAME : <%= customer.getCname() %> </h2>
		<h2> EMAIL : <%= customer.getEmail() %> </h2>
		<h2> PHONE : <%= customer.getPhone() %> </h2>
		<h2>**************************************</h2>
		
		<h2> ID : <%= customer1.getCid() %> </h2>
		<h2> NAME : <%= customer1.getCname() %> </h2>
		<h2> EMAIL : <%= customer1.getEmail() %> </h2>
		<h2> PHONE : <%= customer1.getPhone() %> </h2>
</body>
</html>