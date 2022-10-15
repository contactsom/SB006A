package com.simplilearn.mapping.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.autill.HibernateUtillAnoo;
import com.simplilearn.mapping.Address;
import com.simplilearn.mapping.Student;

public class StudentAddressClient {

	public static void main(String[] args) {
		System.out.println("********* START-StudentAddressClient*****************");
		Transaction tx =null;
		try {
			
			SessionFactory sf=HibernateUtillAnoo.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			/*Prepare the data for Address*/
			Address address = new Address("Gandhi Nagar", "Hyderabad", "Telangana");
			
			/*Prepare the data for Student*/
			Student student = new Student("Virat", "virat@simplilearn.com", "9234766");
			
			student.setAddress(address); /*In Student  providing the data for Address*/
			address.setStudent(student); /*In Address providing the data for Student*/
			
			session.save(student);
			session.save(address);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}

		System.out.println("********* END-StudentAddressClient*****************");
	}
}
