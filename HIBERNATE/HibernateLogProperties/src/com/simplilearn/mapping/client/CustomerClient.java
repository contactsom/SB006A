package com.simplilearn.mapping.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.Customer;
import com.simplilearn.utill.HibernateUtillXml;

public class CustomerClient {

	public static void main(String[] args) {
		

		System.out.println("********* START-CustomerClient*****************");
		Transaction tx =null;
		try {
			SessionFactory sf=HibernateUtillXml.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Customer customer1 = new Customer("Prajwal", "prajwal@simplilearn.com", new Date(), new Long(12345));
			session.save(customer1);
			
			//Customer customer2 = new Customer("Prajwal", "prajwal@simplilearn.com", new Date(), new Long(12345));
			//session.save(customer2);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}

		System.out.println("********* END-CustomerClient*****************");
	
	}

}
