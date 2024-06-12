<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login page</h1>
<%String className=(String)request.getAttribute("Class");
Integer regNum=(Integer)request.getAttribute("regnumber");
List<String> namelist = (List<String>) request.getAttribute("namelist");
%>
<h4>class : <%=className %> </h4>
<h4>Reg Num : <%=regNum %></h4>
<h4>Name: <%= namelist %></h4>
</body>
</html>
