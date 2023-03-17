<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new_create_registration</title>
</head>
<body>
	<h2>new || registration</h2>
	<pre>

	<form action="saveLead" method="post">
		First name<input type="text" name="firstName" /> 
		Last name<input type="text" name="lastName" /> 
		Email<input type="text" name="email" />
		Mobile<input type="text" name="mobile" />
		 <input type="submit" value="save" />

	</form>
</pre>
	${saveMsg}

</body>
</html>