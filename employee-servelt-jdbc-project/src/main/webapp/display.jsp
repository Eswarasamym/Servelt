<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employee record</h1>
<%
ResultSet rs=(ResultSet)request.getAttribute("employeeResultSet");
while(rs!=null && rs.next( )){
%>
<h1><%=rs.getInt(1) %></h1>
<h1><%=rs.getString(2) %></h1>
<h1><%=rs.getString(3) %></h1>
<h1><%=rs.getString(4) %></h1>
<h1><%=rs.getDouble(5) %></h1>


<% 
}
%>

</body>
</html>