package com.hibernate.Demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Demo.model.Address;
import com.hibernate.Demo.model.UserDetail;
import com.hibernate.Demo.model.UserEmployeer;
import com.hibernate.Demo.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );

		Address homeAdd = new Address("Bangalore", "Eco Space Outer Ring Road", "India", 560010);
		Address officeAdd = new Address("Bangalore", " NH-44", "India", 560068); 

		UserDetail user    = new UserDetail("Manish Pareta",1234567890,homeAdd,officeAdd);

		UserEmployeer userEmp1 = new UserEmployeer("ABC LTD", "TEAM LEAD", new Date(), new Date());
		UserEmployeer userEmp2 = new UserEmployeer("XYZ LTD", "MANAGER", new Date(), new Date());
		
		Vehicle vehicle = new Vehicle("Royal Enfield");
		Vehicle vehicle1 = new Vehicle("Ciaz");
		Vehicle vehicle2 = new Vehicle("Jeep");
		
		user.setVehicle(vehicle);
		user.getOfficeVehicle().add(vehicle1);
		user.getOfficeVehicle().add(vehicle2);
		user.getOldAddressList().add(officeAdd);
		user.getOldAddressList().add(homeAdd);
		
		user.getEmployeer().add(userEmp1);
		user.getEmployeer().add(userEmp2);
		
		vehicle.setUserDetail(user);
		vehicle1.setUserDetail(user);
		vehicle2.setUserDetail(user);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(vehicle1);
		session.save(vehicle2);
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();

		//Get Values from DB
		UserDetail dbUser = new UserDetail();
		session  = sf.openSession();

		/*
		 *As we know that UserDetails has 2 Embedded Object/Entity - Old Address and Employeer
		 *so when we get the data from DB Hibernate uses Proxy Objects to pull the values from DB. It extends the existing model class and return us the Proxy object of that
		 *and for Embedded Entity by default it does Lazy initialization of data, means until the value of embedded object is called it will not return the value.
		 *Here in our example we have defined OLD_ADDRESS table as Eager and EMPLOYEER as LAZY Initialization to validate that.
		 *In Lazy initialization, Hibernate returns only the parent object in first get call, and as soon as embedded entity data is fetched, it makes another get call 
		 *for that table and returns the data. During Eager initialization, it loads gets data from all the embedded table(some time which can be a costly operation
		 *if the amount of data is huge.
		 *Point to note here is, during lazy initialization, if the session is closed then embedded data will not be pulled, because we know that
		 *hibernate makes extra DB calls to get embedded table data and if session is closed it will not be able to make any DB call further.
		 */
		//1. Lazy Initialization
		session.beginTransaction();
		dbUser = (UserDetail) session.get(UserDetail.class, 4);
		System.out.println(dbUser.toString());
		System.out.println(dbUser.getEmployeer().size());//Lazy Initialization - Here it will give the list size as per no of records in DB
		session.close();

		//2. Lazy Initialization .
		session  = sf.openSession();
		session.beginTransaction();
		dbUser = (UserDetail) session.get(UserDetail.class, 4);
		
		session.close();
		//Lazy Initialization - Here it will fail with Error
		//Exception in thread "main" org.hibernate.LazyInitializationException: 
		//failed to lazily initialize a collection of role: com.hibernate.Demo.model.UserDetail.employeer, could not initialize proxy - no Session
		//But in output you will notice that
		System.out.println(dbUser.toString());
		System.out.println(dbUser.getEmployeer().size());



	}
}
