<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("pip", "sv", PageContext.PAGE_SCOPE);
pageContext.findAttribute("p1");
String s = (String) request.getParameter("p1");
if(s != null)
{
	application.setAttribute("p1a", s);
	session.setAttribute("p1s", s);
}
%>
<p>Parameter: <%=s %></p>
<p>Application context: <%=application.getAttribute("p1a")%></p>
<p>Session parameter: <%=session.getAttribute("p1s")%></p>
</body>
</html>