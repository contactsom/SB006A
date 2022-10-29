package com.simplilearn.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtillXml {

	static SessionFactory factory;
	
	static {
			Configuration cfg= new Configuration();
			cfg=cfg.configure();
			factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
