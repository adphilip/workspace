<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> Inside jsp file! </p>

<!-- method available for all script blocks -->

<%!
public int add(int a, int b) {
	return a + b;
}

%>

<%
	int i = 6;
	double f = 4;
	out.println("AFAS: " + i + " add: " + add(4,5));
%>

<p>Value from java:</p> <%=f %> adnd <%= add(5,6) %>
</body>
</html>