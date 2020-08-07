<%@page import="java.io.Console"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	
	  <a href="login"><img src="img/googlelogo.png" /></a>
	  <a href="loginForm">로그인</a>
	  <a href="loginFormAnno">로그인</a>
						
	 
</body>
</html>
