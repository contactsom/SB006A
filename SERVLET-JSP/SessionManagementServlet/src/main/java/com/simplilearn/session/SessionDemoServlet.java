package com.simplilearn.session;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionDemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		System.out.println("***********START-service()***********");
		String name=(String)request.getParameter("name");
		String email=(String)request.getParameter("email");
		
		HttpSession session= request.getSession();
		
		System.out.println("NAME :"+name);
		System.out.println("EMAIL :"+email);
		
		System.out.println("Is NEW SESSION - "+session.isNew());
		System.out.println("SESSION ID - "+session.getId());
		System.out.println("SESSION Created Time - "+session.getCreationTime());
		System.out.println("SESSION Last Access Time - "+session.getLastAccessedTime());
		System.out.println("SESSION MAX Inactive Interval - "+session.getMaxInactiveInterval());
		System.out.println("SESSION getValueNames - "+session.getValueNames().toString());
		
		System.out.println("***********END-service()***********");
		
	}
}
