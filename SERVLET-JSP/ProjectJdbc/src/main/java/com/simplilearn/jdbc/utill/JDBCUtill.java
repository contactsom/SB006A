package com.simplilearn.jdbc.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtill {

	static {
		
		try {
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver"); /*MySql Driver*/
			//Class.forName("oracle.jdbc.driver.OracleDriver");/*Oracle Driver*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static Connection getOracleConnection() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1511:XE","system","*****");
		return con;
		
	}
	
	public static Connection getMySqlConnection() throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb006","root","root12345");
		return con;
		
	}
	
	
	public static void cleanup(Statement st,Connection con) {
		
		try {
			if(st!=null)
				st.close();
			
			if(con!=null)
				con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void cleanup(Statement st,Connection con,ResultSet rs ) {
		try {
			if(st!=null)
				st.close();
			
			if(con!=null)
				con.close();
		
			if(rs!=null)
				rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}