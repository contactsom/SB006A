package com.simplilearn.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet  extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("***************START-doGet()-***************");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		out.print("<html><body>");
		out.print("<h1> Welcome to Simplilearn </h1>");
		out.print("<h2> This is Servlet - JSP Classes</h2>");
		out.print("<h3> Hello Servlet </h3>");
		out.print("</html></body>");
		
		System.out.println("***************END-doGet()-***************");
	}
}
