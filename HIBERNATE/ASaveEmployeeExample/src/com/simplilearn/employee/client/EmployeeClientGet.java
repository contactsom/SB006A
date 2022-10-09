package com.simplilearn.employee.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.autill.HibernateUtillAnoo;
import com.simplilearn.employee.Employee;


public class EmployeeClientGet {

	public static void main(String[] args) {
		
		System.out.println("*******START-EmployeeClient********* ");
		SessionFactory factory;
		Transaction tx;
		try {
			factory =  HibernateUtillAnoo.getSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();
			
			// Get the data from DB
			//Employee employeeData=(Employee)session.get(Employee.class,1); // First Argument : Entity Class , Second Argument : Where PK
			Employee employeeData=(Employee)session.get(Employee.class,2); 
			
			
			System.out.println("EMPLOYEE EMAIL : "+employeeData.getEmpemail());
			
			System.out.println(
						"EMPLOYEE ID : "+employeeData.getEmpid()+" "+
						"EMPLOYEE NAME : "+employeeData.getEmpname()+" "+
						"EMPLOYEE EMAIL : "+employeeData.getEmpemail()+" "+
						"EMPLOYEE ADDRESS : "+employeeData.getEmpaddress()+" "+
						"EMPLOYEE DESIGNATION : "+employeeData.getEmpdesignation()+" "+
						"EMPLOYEE SALARY : "+employeeData.getEmpsalery()
								
					);
			
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
