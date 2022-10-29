package com.simplilearn.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtillAnoo {

static SessionFactory factory;
	
	static {
			AnnotationConfiguration cfg= new AnnotationConfiguration();
			cfg=(AnnotationConfiguration)cfg.configure();
			factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
