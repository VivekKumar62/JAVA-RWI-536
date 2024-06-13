<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login page</h1>

<%-- 
    This block of JSP code is commented out
    It was causing issues and has been replaced with correct EL syntax
--%>
<%-- 
<%String className=(String)request.getAttribute("Class");
Integer regNum=(Integer)request.getAttribute("regnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");
List<String> namelist = (List<String>) request.getAttribute("namelist");
%>
<h4>class : <%=className %> </h4>
<h4>Reg Num : <%=regNum %></h4>
<h4>Name: <%= namelist %></h4>
<h4>Date And Time is : <%= time.toString() %> </h4> 
--%>


<%-- 
    This block of JSP code uses correct EL syntax to access model attributes
    It will display the values correctly in the view
--%>
<h4>class : ${className} </h4>
<h4>Reg Num : ${regnumber}</h4>
<h4>Name: ${namelist}</h4>
<h4>Date And Time is : ${time.toString()}</h4>

</body>
</html>
