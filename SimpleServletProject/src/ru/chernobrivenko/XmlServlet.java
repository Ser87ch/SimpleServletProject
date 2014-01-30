package ru.chernobrivenko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter wr = response.getWriter();
		response.setContentType("text/html");
				
		wr.print("<h3>TEST XML Get</h3>");
		
		printParametersMap(request.getParameterMap(),wr);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter wr = response.getWriter();
		response.setContentType("text/html");
				
		wr.print("<h3>TEST XML Post</h3>");
		
		printParametersMap(request.getParameterMap(),wr);
		
	}
	
	private void printParametersMap(Map<String, String[]> p1, PrintWriter wr)
	{
		for(Map.Entry<String, String[]> ar:p1.entrySet())
		{
			wr.printf("<h5>Parameter %s</h5>", ar.getKey());
			for(String s:ar.getValue())
				wr.printf("<p>%s</p>", s);
				
		}
	}
}
