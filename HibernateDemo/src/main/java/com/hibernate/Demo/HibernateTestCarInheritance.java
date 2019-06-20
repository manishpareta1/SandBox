package com.hibernate.Demo;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Demo.inheritance.model.Car;
import com.hibernate.Demo.inheritance.model.HatchBack;
import com.hibernate.Demo.inheritance.model.Sedan;
import com.hibernate.Demo.model.Vehicle;

public class HibernateTestCarInheritance {
	
	public static void main(String[] args) {
		/*
		 * In this example of Inheritance, Only one table is created and a column DTYPE is added to the table.
		 * which will store the class name to discriminate the class/object data in table
		 * 
		 * 
		 */
		Car car = new Car(new Date(), "Hundai- i20", 5); //Transient Object - object state before the object is given to hibernate session 
		
		HatchBack hatchBack = new HatchBack(new Date(), "Honda-Jaz", 5, true);
		Sedan sedan = new Sedan(new Date(), "SKODA-Rapido", 5, true);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session  = factory.openSession();
		session.beginTransaction();
		
		session.save(car);//Persistent Object -  object state when it is handed over to Hibernate Session
		//any update done after save()/get() method call will be tracked and reflected in the data base as well. 
		//hibernate automatically triggers update call if there is any update done on the saved object after the save()/get() method call, only the last one
		session.save(hatchBack);
		session.save(sedan);
		for(int i=0;i<10;i++) {
			car = new Car(new Date(), "Hundai- i20"+i, 1+i);
			session.save(car);
		}
		session.getTransaction().commit();
		session.close();
		car.setCompany("Mercidees-ECalass"); // Detached Object - after session is closed no further updated will be reflected in DB
		car.setSeatingCapacity(5);
		
		
		
		
		/******************************HQL******************************/
		
		//Using org.hibernate.Query class we can writer our own Query to fetch data
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		//Normal HQL Syntex
		Query query = session2.createQuery("from Car where id >5");
		List<Car> carList = query.list();
		
		//Parameterize HQL Query -1 using position
		/*Query query1 = session2.createQuery("select Car from Car where id > ? and company = ?");
		query1.setParameter(0, 3); //setInteger(position, value);
		query1.setString(1, "Hundai-i20"); //setInteger(position, value);
		List<Car> carList2 = query1.list();*/
		
		//Parameterize HQL Query -2 using variable name
		Query query2 = session2.createQuery("select Car from Car where id > :id and company = :company");
		query2.setParameter("id", 3); //setInteger(position, value);
		query2.setParameter("company", "Hundai-i20"); //setInteger(position, value);
		List<Car> carList3 = query2.list();
		
		//Named Query
		/*Query query3 = session.getNamedQuery("Car.carDetailsById");
		List<Car> carNamedQueryList = query3.setParameter(0, 3).list();*/
		
		//Criteria with Restriction(the where clause of SQL)
		Criteria criteria =  session2.createCriteria(Car.class);
		List<Car> carCriteriaList = criteria.add(Restrictions.eq("company", "Hundai- i20")).list();
		
		//Criteria with Projection- it can help you get the selected field from DB or aggregate function like max, min,average,sum
		Criteria criteria2 = session2.createCriteria(Car.class)
				.setProjection(Projections.property("company"))
				.add(Restrictions.like("company", "%20%"));
		
		List<String> companyNameList = criteria2.list();
		
		
		//Criteria with Query by example - we can pass an object by setting up all the fields on which we want to fetch results
		
		Car carExample = new Car();
		carExample.setSeatingCapacity(5);
		carExample.setCompany("Hundai- i20%");
		
		Example example = Example.create(carExample).enableLike();
		
		Criteria criteria3 = session2.createCriteria(Car.class)
				.add(example);
		List<Car> carQueryByExampleList = criteria3.list();
		
		
		
		session2.getTransaction().commit();
		session2.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		
		System.out.println("Total car found: "+carList.size());
		//System.out.println("Total car found with id>3 and companyName with Position Query: "+carList2.size());
		//System.out.println("Total car found with id>3 and companyName with variable name Query: "+carList3.size());
		//System.out.println("Total car found with id>3 and companyName with variable name Query: "+carNamedQueryList.size());
		System.out.println("Total car found with company Hundai-i20 is: "+carCriteriaList.size());
		System.out.println("List of Car Name using Criteria and Projection: "+companyNameList.size());
		System.out.println("List of Car using Criteria and Query by Example: "+carQueryByExampleList.size());
		for(Car c : carList) {
			System.out.println(c.toString());
		}
		
		for(String name : companyNameList) {
			System.out.println(name);
		}
		
		for(Car cr : carQueryByExampleList) {
			System.out.println(cr.toString());
		}
	}
	


} 
