package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementExample {

	public static void main(String[] args) {
		
		try {
			
			//1. Load the Driver 
			//Class.forName("com.mysql.jdbc.Driver"); /*This is deprecated*/
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Get the Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb006","root","root12345");
			
			//3. Create the Statement
			Statement stmt=con.createStatement();
			
			//4. Prepare the Query & Execute
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
			
			/*We can fetch the value by passing the index */
			/*while(rs.next()) {
				System.out.println("ID "+rs.getInt(1)+" "+
									"AGE "+rs.getInt(2)+" "+
									"First Name "+rs.getString(3)+" "+
									"Last Name "+rs.getString(4));
			}*/
		
			/*We can fetch the value by passing the Column Name */
			while(rs.next()) {
				System.out.println("ID "+rs.getInt("id")+" "+
									"AGE "+rs.getInt("age")+" "+
									"First Name "+rs.getString("firstName")+" "+
									"Last Name "+rs.getString("lastName"));
			}
		
			//5. Close the Resource 
			con.close();
			stmt.close();
			rs.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Exception Occcured"+e);
		}
	
		
		
		
		
		
	}
}