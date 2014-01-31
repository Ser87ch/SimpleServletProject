package ru.chernobrivenko.simpservl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter wr = response.getWriter();
		response.setContentType("text/html");
		wr.print("<h2>Test Get</h2>");
		
		HttpSession s = request.getSession();
		ServletContext sc = request.getServletContext();
		
		String str = request.getParameter("p1");
		if(str != "" && str != null)
		{
			s.setAttribute("p1s", request.getParameter("p1"));
			sc.setAttribute("p1c", request.getParameter("p1"));
		}
		
		wr.printf("Session atribute: %s <br>",  (String) s.getAttribute("p1s"));
		wr.printf("Context atribute: %s",  (String) sc.getAttribute("p1c"));
	}
}
