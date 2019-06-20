package com.hibernate.Demo.dao;
/**
 * This is BaseDaoImpl class for all DAOImpl classes
 * @author manish.pareta
 * @Since 30March2019
 */

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Demo.util.HibernateSessionFactorySingleton;

public class BaseDAOImpl<T extends Object> implements BaseDAO<T> {

	/**
	 * this generic method for save class object
	 * @param generic class object
	 * @return true|false, true if save successfully otherwise false 
	 * */
	
	public static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
	
	@Transactional
	public Boolean save(T t) {
		
		Session session=null;
		try{
			session=getNewSession();
			session.beginTransaction();
			session.save(t);
			session.getTransaction().commit();
			//session.refresh(t);
			return true;
		}
		catch(RuntimeException e){
			System.out.println("Exception is occurred because of "+e);
			return false;
		}
		finally{
			closeSession(session);
			//To Check Rollback
			//int i = 10/0;
		}
	}

/*	*//**
	 * This method will get record based on id
	 * @param GroupBlockVo id
	 * @return GroupBlock Vo object
	 *//*
	@SuppressWarnings("unchecked")
	public T get(int id) {
		Session session = null;
		
		try {
			session = getNewSession();
			//Query to get the data from DB and needs to be returned
			
		}catch(Exception e) {
			System.out.println("Exception occured in while getting details using Id");
		}finally {
			closeSession(session);
		}
		return null;
	}

	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}*/

	public Boolean update(T t) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getNewSession();
			session.beginTransaction();
			session.update(t);
			return true;
		}catch(RuntimeException e){
			System.out.println("Runtime exception occured while update");
		}finally {
			closeSession(session);
		}
		return null;
	}

	/**
	 * This method will delete object of T
	 * @param Object to be deleted
	 * @return true|false based on the success or failure of the tnx
	 */
	public Boolean delete(T t) {
		Session session=null;
		try{
			session=getNewSession();
			session.beginTransaction();
			session.delete(t);
			session.getTransaction().commit();
			return true;
		}
		catch(RuntimeException e){
			System.out.println("Exception is occurred because of "+e);
		}
		finally{
			closeSession(session);
		}
		
		return null;
	}

	/**
	 * this generic method for delete class object
	 * @param id
	 * @return true|false, true if delete successfully otherwise false
	 * */
	
	public Boolean deleteById(int id) {
		Session session=null;
		try{
			session=getNewSession();
			session.beginTransaction();
			session.delete(id);
			session.getTransaction().commit();
			return true;
		}
		catch(RuntimeException e){
			System.out.println("Exception is occurred because of "+e);
			return false;			
		}
		finally{
			closeSession(session);
		}
	}
	/**
	 * This method will return Session object
	 * @return session object
	 */
	public Session getNewSession() {
		
		return HibernateSessionFactorySingleton.getSessionFactory().openSession();
	}
	
	/**
	 * This method will close the session object
	 */
	public void closeSession(Session session) {
		session.close(); 
	}
	

}
