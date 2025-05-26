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
response.sendRedirect("https://github.com/");

String name=(String)session.getAttribute("usn");
String pwd=(String)session.getAttribute("pwd");

System.out.println(name);
System.out.println(pwd);

%>

</body>
</html>