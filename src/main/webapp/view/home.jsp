<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Data coming soon..</h1>

<a href="/student">Add Student</a>
<table>
	<tr>
				<td>Name</td>
				<td>Mobile</td>
				<td>Country</td>
				<td>Action</td>	
			</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.name}</td>
				<td>${student.country}</td>
				<td>${student.mobile}</td>
				<td><a href="/student/${student.id}"> Edit</a> <a href="/student/${student.id}/delete">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>