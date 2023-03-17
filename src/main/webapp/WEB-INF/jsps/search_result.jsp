<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	<h2>All || Lead</h2>
	<table border="2px">
		<tr>
			<th>first name</th>
			<th>last name</th>
			<th>email</th>
			<th>mobile</th>
			<th>delete</th>
			<th>update</th>
		</tr>
		<c:forEach items="${leads}" var="lead">  
		<tr>
			<td>${lead.firstName}</td>
			<td>${lead.lastName}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>
			<td><a href="delete?id=${lead.id}">delete</a></td>
			<td><a href="update?id=${lead.id}">update</a></td>
		</tr>
</c:forEach> 

	</table>

</body>
</html>