package com.simplilearn.mapping.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.autill.HibernateUtillAnoo;
import com.simplilearn.mapping.Account;
import com.simplilearn.mapping.Customer;

public class AccountCustomerClient {

	public static void main(String[] args) {
		System.out.println("********* START-CustomerOrderClient*****************");
		Transaction tx =null;
		try {
			
			SessionFactory sf=HibernateUtillAnoo.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Customer c1= new Customer("Raj", "raj@simplilearn.com", new Date(), new Long(98236));
			session.save(c1);
			
			Customer c2= new Customer("Uday", "uday@simplilearn.com", new Date(), new Long(98452));
			session.save(c2);
			
			Account a1= new Account("SAVING", 891.0);
			session.save(a1);
			
			Account a2= new Account("CURRENT", 900.0);
			session.save(a2);
			
			Account a3= new Account("CREDIT", 300.0);
			session.save(a3);
			
			Account a4= new Account("CURRENT", 1000.0);
			session.save(a4);
			
			Account a5= new Account("CREDIT", 2000.0);
			session.save(a5);
			
			
			Set<Account> account1 =new HashSet<Account>();
			account1.add(a1);
			account1.add(a2);
			account1.add(a3);
			c1.setAccount(account1);
			
			
			Set<Account> account2 =new HashSet<Account>();
			account2.add(a4);
			account2.add(a5);
			c2.setAccount(account2);
			
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
