package com.simplilearn.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class PreparedStatementExample {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con=JDBCUtill.getMySqlConnection();
			PreparedStatement	pstmt=con.prepareStatement("INSERT INTO STUDENT VALUES (?, ?, ?, ?)");  /*Place Holder*/
			System.out.println("***START-Data Insert***");
			
			/*First Record*/
			pstmt.setInt(1, 100);	
			pstmt.setInt(2, 21);
			pstmt.setString(3, "JACK");
			pstmt.setString(4, "EDITION");
			pstmt.execute();
			
			/*Second Record*/
			pstmt.setInt(1, 101);	
			pstmt.setInt(2, 31);
			pstmt.setString(3, "Uday");
			pstmt.setString(4, "Nick");
			pstmt.execute();
			
			/*Third Record*/
			pstmt.setInt(1, 103);	
			pstmt.setInt(2, 22);
			pstmt.setString(3, "Kunnal");
			pstmt.setString(4, "Tushar");
			pstmt.execute();
			
			System.out.println("***END-Data Insert***");
		
			JDBCUtill.cleanup(con, pstmt);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("**** Error Occured while Inserting the data in to table STUDENT ****");
		}
	}
}


