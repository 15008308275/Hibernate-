package com.hxzy.hibernet001.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = bulidSessionFactory();

	private static SessionFactory bulidSessionFactory() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
