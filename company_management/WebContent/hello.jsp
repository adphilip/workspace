<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Management</title>
</head>
<body>

	<h1>Company management - hello.jsp</h1>
	
	<form action="/company_management/ServletOne" method="post">
	Name: <input type="text" value="" name="name"/>
	<input type="submit" value ="Name submit">
	</form>
	
	<form action="/company_management/ServletOne" method="get">
	ID Employee: <input type="text" value="" name="idemployee"/>
	<input type="submit" value ="IDEmployee submit">
	</form>
</body>
</html>