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
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age"));
%>
<%=name%>님 만 나이는 <%=age-1%>세 입니다. 
</body>
</html>