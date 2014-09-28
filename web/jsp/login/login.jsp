<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/jsp/framework/title.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<script type="text/javascript" src="/jsp/framework/jquery-2.1.1.js"></script>
<title>Login jsp</title>
</head>
<body>
<form action="login/validate.html" method="post">
	<input type="text" name="userName"></input><br></br>
	<input type="text" name="userPassword"></input><br></br>
	<input type="submit" value="submit"></input>
</form>
</body>
</html>