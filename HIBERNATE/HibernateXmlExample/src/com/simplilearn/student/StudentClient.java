package com.simplilearn.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {

	public static void main(String[] args) {
		
		System.out.println("*******START-StudentClient********* ");
		SessionFactory factory;
		Transaction tx;
		
		try {
			
			//1. Create the Configuration Object
			Configuration cfg= new Configuration();
			System.out.println("---------1. Create the Configuration Object---------");
			
			//2. Call the Configure Method
			cfg=cfg.configure();
			System.out.println("---------2. Call the Configure Method---------");
			
			//3. Through the COnfiguration Object call the Build Session Factory
			factory = cfg.buildSessionFactory();
			System.out.println("---------3. Through the COnfiguration Object call the Build Session Factory---------");
			
			//4. With the factory object open the session
			Session session = factory.openSession();
			System.out.println("---------4. With the factory object open the session---------");
			
			
			//5. With the help of Session object begin the transaction 
			tx = session.beginTransaction();
			System.out.println("---------5. With the help of Session object begin the transaction ---------");
			
			//6. Prepare the  Business Object
			Student stu= new Student("SAI", "sai@simplilearn.com", 988912);
			//Student stu= new Student("DEEP", "deep@simplilearn.com", 728912);
			System.out.println("---------6. Prepare the  Business Object ---------");
			
			//7. Save the Data 
			// Provide the business object to the session 
			session.save(stu);
			System.out.println("---------7. Save the Data ---------");
			
			//8. Commit in to DB
			tx.commit();
			System.out.println("---------8. Commit in to DB ---------");
			
			//9. Close the Resourse
			session.close();
			factory.close();
			System.out.println("---------9. Close the Resourse ---------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("****Error Exist while inserting the data *****");
		}
		
		System.out.println("*****END-StudentClient**** ");
	}
}
