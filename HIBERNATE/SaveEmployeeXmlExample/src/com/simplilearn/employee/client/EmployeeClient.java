package com.simplilearn.employee.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.simplilearn.employee.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		System.out.println("*********START-EmployeeClient*********");
		
		SessionFactory factory = null ;
		Session session= null ;
		Transaction tx = null ;
		
		try {
			
			//1. Create the Configuration Object
			Configuration cfg= new Configuration();
			System.out.println("------------ 1. Create the Configuration Object------------");
			
			//2. Call the Configure Method()
			cfg=cfg.configure();
			System.out.println("------------ 2. Call the Configure Method()------------");
			
			//3. Through the configuration object call the buildSessionFactory()
			factory = cfg.buildSessionFactory();
			System.out.println("------------ 3. Through the configuration object call the buildSessionFactory()------------");
			
			//4. With the factory object open the session 
			session=factory.openSession();
			System.out.println("------------ 4. With the factory object open the session ------------");
			
			//5. With the help of session object call the beginTransaction()
			tx = session.beginTransaction();
			System.out.println("------------ 5. With the help of session object call the beginTransaction() ------------");
			
			//6. Prepare the Business Object
			Employee emp = new Employee("Prajwal", "prajwal@simplilearn.com", "3rd Cross,Bengaluru", 40000, "Developer");
			System.out.println("------------ 6. Prepare the Business Object ------------");
			
			//7. Save the Data
			session.save(emp);
			System.out.println("------------ 7. Save the Data ------------");
			
			//8. Commit in to DB
			tx.commit();
			System.out.println("------------ 8. Commit in to DB ------------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			if(tx!=null) {
				tx.rollback();
			}
		}
		
		//9. Close the Resourse
		 factory.close();
		 session.close();
		 System.out.println("------------ 9. Close the Resourse------------");
		 
		
		System.out.println("*********END-EmployeeClient*********");
	}
}
