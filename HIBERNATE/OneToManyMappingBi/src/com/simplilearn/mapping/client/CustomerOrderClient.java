package com.simplilearn.mapping.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.Customer;
import com.simplilearn.mapping.Order;
import com.simplilearn.utill.HibernateUtillXml;

public class CustomerOrderClient {


	public static void main(String[] args) {
		System.out.println("********* START-CustomerOrderClient*****************");
		Transaction tx =null;
		try {
			
			SessionFactory sf=HibernateUtillXml.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Order order1= new Order(1, new Double(100), new Date(), "NEW");
			session.save(order1);
			
			Order order2= new Order(1, new Double(110), new Date(), "NEW");
			session.save(order2);
			
			Order order3= new Order(1, new Double(210), new Date(), "NEW");
			session.save(order3);
			
			
			Customer customer = new Customer("Rahul", "rahul@simplilearn.com",new Long(9865123) , new Date());

			/*All order belongs to one Customer*/
			order1.setCustomer(customer);
			order2.setCustomer(customer);
			order3.setCustomer(customer);
			
			session.save(customer);
			
			/*Set<Order> orders= new HashSet<Order>();
			orders.add(order1);
			orders.add(order2);
			orders.add(order3);
			customer.setOrder(orders);*/
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}

		System.out.println("********* END-CustomerOrderClient*****************");
	}

}
