package com.simplilearn.collection.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.collection.Employee;
import com.simplilearn.utill.HibernateUtillXml;

public class EmployeeClient {

	public static void main(String[] args) {
		System.out.println("********* START-CustomerOrderClient*****************");
		Transaction tx =null;
		try {
			
			System.out.println("----1---");
			
			SessionFactory sf=HibernateUtillXml.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			System.out.println("----2---");
			
			String[] empcourse={"JAVA","HIBERANTE","JDBC","JSP"};
			
			System.out.println("----3---");
			List<String> empemail= new ArrayList<String>();
			
			empemail.add("pankaj@simplilearn.com");
			empemail.add("remiosisanya@simplilearn.com");
			empemail.add("sharjil@simplilearn.com");
			empemail.add("hanumanprasad@simplilearn.com");
			
			System.out.println("----4---");
			List<Integer> empmarks= new ArrayList<Integer>();
			empmarks.add(50);
			empmarks.add(60);
			empmarks.add(70);
			empmarks.add(80);
			
			System.out.println("----5---");
			Set<Long> empphone= new HashSet<Long>();
			empphone.add(new Long(9876123));
			empphone.add(new Long(9876124));
			empphone.add(new Long(9876125));
			empphone.add(new Long(9876126));
			
			System.out.println("----6---");
			Map<String,Long> empreferance = new HashMap<String, Long>();
			empreferance.put("Pankaj", new Long(12345));
			empreferance.put("Remios", new Long(12346));
			empreferance.put("Sharjil", new Long(12347));
			empreferance.put("Hanuman", new Long(12348));
			
			System.out.println("----7---");
			Employee employee = new Employee("Prajwal", "01982", "B.Tech", empcourse, empemail, empmarks, empphone, empreferance);
			
			//(String empname, String empdob, String empqualification, String[] empcourse, List<String> emapemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreferance)

			
			System.out.println("----8---");
			session.save(employee);
			System.out.println("----9---");
			
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
