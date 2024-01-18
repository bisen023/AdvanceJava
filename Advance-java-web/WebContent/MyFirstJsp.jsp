<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%  
String name = "Rays";
for(int i = 1;i<10;i++){ %>
<%=name%>
<h1> <%=i %>THIS IS MY FIRST JSP PAGE </h1>
<%} %>

</body>
</html>