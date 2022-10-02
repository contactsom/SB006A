package com.simplilearn.concurrency;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtill;

public class JDBCConcurrencyExample {

	public static void main(String[] args) {
	try {
		Connection con= JDBCUtill.getMySqlConnection();
		//Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); // todo
		Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//Statement stmt =  con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= stmt.executeQuery("SELECT * FROM Employees");
		System.out.println("********* Before Upadate*************");
		while(rs.next()) {
			System.out.println("ID "+rs.getInt("id")+" "+
								"AGE "+rs.getInt("age")+" "+
								"First Name "+rs.getString("firstName")+" "+
								"Last Name "+rs.getString("lastName"));
		}
		rs.beforeFirst();
		/*I want my all student age to be increased by 20 Years*/
		while(rs.next()) {
			int updatedage=rs.getInt("age")+20;
			rs.updateInt("age", updatedage);
			rs.updateRow();
		}
		rs.beforeFirst();
		System.out.println("********* After Upadate*************");
		while(rs.next()) {
			System.out.println("ID "+rs.getInt("id")+" "+
								"AGE "+rs.getInt("age")+" "+
								"First Name "+rs.getString("firstName")+" "+
								"Last Name "+rs.getString("lastName"));
		}
		JDBCUtill.cleanup(stmt, con, rs);
		
	} catch (Exception e) {
		e.printStackTrace();
		System.err.println("***** Error Occured while Updating the data ");
	}
		
	}

}
