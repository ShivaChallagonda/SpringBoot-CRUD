<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/save" method="post" modelAttribute="student">
		<form:hidden path="id" />
		<form:input path="name" placeholder="Name" />
		<form:input path="mobile" placeholder="Mobile" />
		<form:input path="country" placeholder="Country" />
		<button type="submit">Add Student</button>
	</form:form>

</body>
</html>