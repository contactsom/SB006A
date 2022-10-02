package com.simplilearn.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.utill.JDBCUtill;

public class CallableStatementExample {

	public static void main(String[] args) {
		try {
			System.out.println("*******START-Calling the Stored procedure********");
			Connection con= JDBCUtill.getMySqlConnection();
			PreparedStatement pstmt= con.prepareCall("{call GetAllEmployee}");
			pstmt.execute();
			
			ResultSet rs= pstmt.getResultSet();
			
			while(rs.next()) {
				System.out.println("ID "+rs.getInt("id")+" "+
									"AGE "+rs.getInt("age")+" "+
									"First Name "+rs.getString("firstName")+" "+
									"Last Name "+rs.getString("lastName"));
			}
			
			JDBCUtill.cleanup(pstmt, con, rs);
			System.out.println("*******END-Calling the Stored procedure********");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("*******Error Occured While Calling the Stored procedure********");
		}
	}
}
