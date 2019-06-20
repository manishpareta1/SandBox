package com.hibernate.Demo.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.Cloneable;

public class HibernateSessionFactorySingleton extends Cloneable{

	
	public static SessionFactory sessionFactory= null;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new CloneNotSupportedException();
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
	}
	

}
