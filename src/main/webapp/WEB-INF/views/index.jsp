<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Spring Boot Jsp </title>
	</head>
	<body>
		<h1>Hello Spring Boot!</h1>
		 <pre>
		 <%
		 new com.nexacro17.xapi.util.JarInfo().info(out);
		 %>
		 </pre>
	</body>
</html>