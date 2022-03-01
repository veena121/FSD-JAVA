<%@page import="com.ecommerce.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Products</title>
</head>
<body>
	
	<%
		HttpSession ses = request.getSession();
		Product product = (Product)ses.getAttribute("product");
	%>
	
	<table>
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>ProductPrice</th>
		</tr>
		<tr>
			<td><% out.print(product.getPid());%></td>
			<td><% out.print(product.getpName());%></td>
			<td><% out.print(product.getPrice());%></td>
		</tr>
	</table>
</body>
</html>