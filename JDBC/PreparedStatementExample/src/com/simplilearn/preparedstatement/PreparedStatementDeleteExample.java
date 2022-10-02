package com.simplilearn.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class PreparedStatementDeleteExample {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con=JDBCUtill.getMySqlConnection();
			PreparedStatement	pstmt=con.prepareStatement("TODO");  /*Place Holder*/
			System.out.println("***START-Data Update***");
			/*Home Work*/
			
			/*First Record*/
			/*pstmt.setString(1, "Karan"); 
			pstmt.setInt(2, 103);	
			pstmt.executeUpdate();*/
			
			System.out.println("***END-Data Update***");
		
			JDBCUtill.cleanup(con, pstmt);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("**** Error Occured while Inserting the data in to table STUDENT ****");
		}
	}
}


