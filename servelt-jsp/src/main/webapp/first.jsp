<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- declartion tag -->
<%!
int age=35;
public double eat(){
	System.out.println("Person is eating");
	return 2.3;
}
%>
<!-- Experrsion tag -->

<h1 style="color:red"> age is : <%=age %></h1>
<h1 style="color:blue">method value is :<%=eat() %></h1>

<!-- scripting tag -->
<%
System.out.println("welcome to jsp session");
System.out.println(age);
System.out.println(eat());
%>

</body>
</html>