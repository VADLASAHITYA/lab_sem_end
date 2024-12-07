<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>NAME</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>

<c:forEach var="s" items="${list}">
<tr>
<td>${s.id}</td>
<td>${s.name}</td>
<td><a href="/springmvc/edit/${s.id}">EDIT</a></td>
<td><a href="/springmvc//delete/${s.id}">DELETE</a></td>
</tr>
</c:forEach>
    
</table>
</body>
</html>