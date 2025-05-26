<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
     String name=request.getParameter("username");
     String password=request.getParameter("userpassword");

session.setAttribute("usn",name);
session.setAttribute("pwd",password);

%>

<h2 style="color:green">user=<%=name %> has logged in successfully</h2>


</body>
</html>