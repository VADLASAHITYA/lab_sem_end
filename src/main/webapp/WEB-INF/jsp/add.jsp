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
<h1> Add Student </h1>
<form:form method="post" action="/springmvc/addsave">
	ID: <form:input path="id"/>
	NAME: <form:input path="name"/>
	<input type="submit" value="save" /> 
</form:form>
</body>
</html>