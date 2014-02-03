<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Test</h3>

	<%!public int add(int i, int j) {
		return i + j;
	}%>

	<%
		String[] s = { "jsp", "fesf", "sdg" };
		int i = 0;
		for (String a : s) {
	%>
	<p>
		<%="test " + a%>

		<%
			i = add(i, 1);
				out.print(i);
		%>
	</p>
	<%
		}
	%>


</body>
</html>