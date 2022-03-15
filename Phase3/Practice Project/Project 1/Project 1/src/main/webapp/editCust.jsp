<%@page import="com.ecommerce.entity.Customers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Customer</title>
</head>
<body>
<% Customers cust = (Customers) session.getAttribute("cust"); %>
	<form action="save" method="post">
		Customer Name : <input type="text" name="cname" value="<%out.print(cust.getName());%>"><br><br>
		Customer Email : <input type="email" name="email" value="<%out.print(cust.getEmail());%>"><br><br>
		Customer Password : <input type="password" name="password" value="<%out.print(cust.getPassword());%>"><br><br>
		<input type="submit" value="Update">
	</form>
</body>
</html>