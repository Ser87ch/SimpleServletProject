<%@page import="org.apache.tomcat.util.net.SecureNioChannel.ApplicationBufferHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Init</title>
</head>
<body>

<%! 
public void jspInit() {
	getServletContext().setAttribute("sc",getServletConfig().getInitParameter("ji"));
	
}
%>

<p><%=config.getInitParameter("ji") %></p>
<p><%=getServletContext().getAttribute("sc") %></p>

</body>
</html>