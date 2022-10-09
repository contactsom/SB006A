package com.simplilearn.ahibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.simplilearn.ahibernate.Customer;

public class CustomerClient {

	public static void main(String[] args) {
		
		System.out.println("*******START-CustomerClient********* ");
		SessionFactory factory;
		Transaction tx;
		
		try {
			
			//1. Create the Configuration Object
			AnnotationConfiguration acfg= new AnnotationConfiguration();
			System.out.println("---------1. Create the Configuration Object---------");
			
			//2. Call the Configure Method
			acfg=(AnnotationConfiguration) acfg.configure();
			System.out.println("---------2. Call the Configure Method---------");
			
			//3. Through the COnfiguration Object call the Build Session Factory
			factory = acfg.buildSessionFactory();
			System.out.println("---------3. Through the COnfiguration Object call the Build Session Factory---------");
			
			//4. With the factory object open the session
			Session session = factory.openSession();
			System.out.println("---------4. With the factory object open the session---------");
			
			
			//5. With the help of Session object begin the transaction 
			tx = session.beginTransaction();
			System.out.println("---------5. With the help of Session object begin the transaction ---------");
			
			//6. Prepare the  Business Object
			System.out.println("---------6. Prepare the  Business Object ---------");
			//Customer cust= new Customer("Rahul", "rahul@simplilearn.com", 981234, "Indore", 57000);
			Customer cust= new Customer("Amit", "amit@simplilearn.com", 921234, "Chennai", 17000);
			
			//7. Save the Data 
			// Provide the business object to the session 
			session.save(cust);
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
		
		System.out.println("*****END-CustomerClient**** ");
	
	}

}
