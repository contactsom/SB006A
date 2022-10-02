package com.simplilearn.lms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.jdbc.utill.JDBCUtill;
import com.simplilearn.lms.book.Book;

public class BookService {

	Connection con = null;
	PreparedStatement ps= null;
	 ResultSet rs  = null;
	 
	public String verifyUsers(String user, String password) {
	
		System.out.println("******* Start - verifyUsers() ******** ");
		
		String verifyUsers="";
		try {
			
			 con = JDBCUtill.getMySqlConnection();
			 ps = con.prepareStatement("SELECT * FROM USERS where USER_NAME = ? AND USER_PASS = ?");
			 ps.setString(1, user);
			 ps.setString(2, password);
			 rs = ps.executeQuery();
			 // If username and Password given by the student is correct than rs is not empty else empty
			 
			 if(rs.next()) {
				 	System.out.println("Logged Successfully");
					verifyUsers="User Logged Successfully";
			 }else {
				 	System.out.println("Login failed ");
					verifyUsers="Sorry , You are not correct user";
			 }
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occured while validating the users");
		}
		
		
		System.out.println("******* End - verifyUsers() ******** ");
		
		return verifyUsers;
		
		
	}

	public int addBook(Book book) {
		System.out.println("******* Start - addBook() ******** ");
		int numberofrecord=0;
		try {
			 con = JDBCUtill.getMySqlConnection();
			 ps = con.prepareStatement("INSERT INTO BOOKS VALUES (?,?,?,?,?,?)");
			 ps.setInt(1, book.getBookid());
			 ps.setString(2, book.getBookname());
			 ps.setString(3, book.getBookauthor());
			 ps.setString(4, book.getBookpublication());
			 ps.setInt(5, book.getBookprice());
			 ps.setInt(6, book.getBookisbn());
			 numberofrecord= ps.executeUpdate();
			 
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("******* Error Occure while inserting the data");
		}
		System.out.println("******* End - addBook() ******** ");
		return numberofrecord;
	}
	
	
	
	
	
	
	
	
	
	
	

}
