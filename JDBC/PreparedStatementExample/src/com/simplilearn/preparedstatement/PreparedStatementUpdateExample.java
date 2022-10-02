package com.simplilearn.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class PreparedStatementUpdateExample {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con=JDBCUtill.getMySqlConnection();
			PreparedStatement	pstmt=con.prepareStatement("UPDATE STUDENT SET STU_FNAME = ? WHERE STU_ID = ?");  /*Place Holder*/
			System.out.println("***START-Data Update***");
			
			/*First Record*/
			pstmt.setString(1, "Karan"); /*Index of Place holder */
			pstmt.setInt(2, 103);	
			pstmt.executeUpdate();
			
			/*Second Record*/
			pstmt.setString(1, "Rahul"); /*Index of Place holder */
			pstmt.setInt(2, 101);	
			pstmt.executeUpdate();
			
			
			System.out.println("***END-Data Update***");
		
			JDBCUtill.cleanup(con, pstmt);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("**** Error Occured while Inserting the data in to table STUDENT ****");
		}
	}
}


