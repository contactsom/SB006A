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
			
			Address address = new Address("Gandhi Nagar", "Hyderabad", "Telangana");
			Student student = new Student("Rohit", "rohit@simplilearn.com", "98761256",address);
			
			session.save(address);
			session.save(student);
			
			
			/*Address address = new Address("Kasturba road", "Bengaluru", "Karnataka");
			Student student = new Student("Virat", "virat@simplilearn.com", "9234766",address);
			
			session.save(address);
			session.save(student);*/
			
			
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
