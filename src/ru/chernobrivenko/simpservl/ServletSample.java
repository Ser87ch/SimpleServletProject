package ru.chernobrivenko.simpservl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "Simple servlet", urlPatterns = { "/ServletSample" })
public class ServletSample extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter wr = response.getWriter();
		response.setContentType("text/html");
		wr.print("<h2>Test Get</h2>");
		printParameterMap(request.getParameterMap(), wr);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter wr = response.getWriter();
		response.setContentType("text/html");
		wr.print("<h2>Test Post</h2>");
		printParameterMap(request.getParameterMap(), wr);
	}


	private void printParameterMap(Map<String, String[]> mp, PrintWriter wr)
	{
		for(Map.Entry<String, String[]> en:mp.entrySet())
		{
			wr.printf("<h3>Parameter %s:</h3>", en.getKey());
			for(String s: en.getValue())
				wr.printf("<p>%s</p>", s);
		}
	}
}
