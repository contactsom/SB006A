package com.simplilearn.employee.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.autill.HibernateUtillAnoo;
import com.simplilearn.employee.Employee;


public class EmployeeClient {

	public static void main(String[] args) {
		
		System.out.println("*******START-EmployeeClient********* ");
		SessionFactory factory;
		Transaction tx;
		try {
			factory =  HibernateUtillAnoo.getSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();
			
			//6. Prepare the  Business Object
			//Employee emp = new Employee("Vijay", "vijay@simplilearn.com", "3rd Cross, 5Th main , Noida", 9000, "CEO");
			Employee emp = new Employee("Madhu", "madhu@simplilearn.com", "2rd Cross, 1Th main , Chennai", 8000, "CFO");

			//7. Save the Data 
			// Provide the business object to the session 
			session.save(emp);
			
			//8. Commit in to DB
			tx.commit();
			
			//9. Close the Resourse
			session.close();
			factory.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("****Error Exist while inserting the data *****");
		}
		
		System.out.println("*****END-EmployeeClient**** ");
	
	}

}
