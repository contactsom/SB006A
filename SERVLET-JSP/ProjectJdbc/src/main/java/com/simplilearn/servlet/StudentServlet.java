package com.simplilearn.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.jdbc.utill.JDBCUtill;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/") /* Class Level URl Patern : For any URL Pattern this is the Servlet*/
public class StudentServlet extends HttpServlet{

	public static final String INSERT="INSERT INTO STUDENT_PROJECT VALUES(?,?,?,?)";
	public static final String  SEARCH_BY_EMAIL_ID="SELECT * FROM STUDENT_PROJECT WHERE EMAIL= ? ";
	
	public StudentServlet() {
		super(); 
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("************START-doPost()************");
		
		String path=request.getServletPath();
		System.out.println("PATH-"+path); //insert
		
		switch (path) {
		
		case "/insert":
				savedata(request,response);
			break;
			
		case "/search":
			getByEmailId(request,response);
		break;

		default:
			break;
		}
		
		System.out.println("************END-doPost()************");
	}

	private void getByEmailId(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("*********** START-getByEmailId()");
		
		String emailId=(String)request.getParameter("emailId");

		/*Search the data by Email ID */
		
		try {
			Connection con = JDBCUtill.getMySqlConnection();
			PreparedStatement pstmt = con.prepareStatement(SEARCH_BY_EMAIL_ID);
			pstmt.setString(1, emailId);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String fname=rs.getString("FIRST_NAME");
				String lname=rs.getString("LAST_NAME");
				String email=rs.getString("EMAIL");
				String password=rs.getString("PASSWORD");
				
				System.out.println("First Name "+fname);
				System.out.println("Last Name "+lname);
				System.out.println("Email "+email);
				System.out.println("Password "+password);
				
				displaysearchResult(fname,lname,email,password,request,response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error Occured while Searching  the data in to STUDENT_PROJECT Table");
		}
		
		System.out.println("*********** END-getByEmailId()");
	}

	private void displaysearchResult(String fname, String lname, String email, String password,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("FNAME", fname);
		request.setAttribute("LNAME", lname);
		request.setAttribute("EMAIL", email);
		request.setAttribute("PASSWORD", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("searchresult.jsp");
		rd.forward(request, response);
		
	}

	private void savedata(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("************START-savedata()************");
		
		/*Recived the data from User*/
		String firstname=(String)request.getParameter("firstname");
		String lastname=(String)request.getParameter("lastname");
		String emailId=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		
		System.out.println("First name - "+firstname);
		System.out.println("Last name - "+lastname);
		System.out.println("Email - "+emailId);
		System.out.println("Password - "+password);
		
		/*Save the data in to DB*/
		
		try {
			Connection con = JDBCUtill.getMySqlConnection();
			PreparedStatement pstmt = con.prepareStatement(INSERT);
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, emailId);
			pstmt.setString(4, password);
			pstmt.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error Occured while Inserting the data in to STUDENT_PROJECT Table");
		}
		
		System.out.println("Data Saved Successfully in to STUDENT_PROJECT Table");
		display(request,response);
		
		System.out.println("************END-savedata()************");
	}
	
	
	public static void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("************START-display()************");
		
		/*Recived the data from User*/
		String firstname=(String)request.getParameter("firstname");
		String lastname=(String)request.getParameter("lastname");
		String emailId=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		
		System.out.println("First name - "+firstname);
		System.out.println("Last name - "+lastname);
		System.out.println("Email - "+emailId);
		System.out.println("Password - "+password);
		
		request.setAttribute("FNAME", firstname);
		request.setAttribute("LNAME", lastname);
		request.setAttribute("EMAIL", emailId);
		request.setAttribute("PASSWORD", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		System.out.println("************START-display()************");
		
	}
	
}
