<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <h1>Welcome to home page</h1>
    
  <%--   <%
        String name = (String) request.getAttribute("name");
        Integer roll = (Integer) request.getAttribute("roll");
        List<String> namelist = (List<String>) request.getAttribute("namelist");
    %>
    <h3>Name: <%= name %></h3>
    <h3>Roll: <%= roll %></h3>
    <h3>Name List:</h3>
    <% for(String s: namelist) { %>
        <h4><%= s %></h4>
    <% } %>--%>
    
    <h3>Name: ${name  }</h3>
    <h3>Roll:  ${roll }</h3>
    <h3>Name List:  ${namelist } </h3>
    
    
    <a href="login">Login</a>
</body>
</html>
