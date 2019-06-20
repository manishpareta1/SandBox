package com.hibernate.Demo.dao;

/**
 * This is BaseDao class for all DAO classes
 * @author manish.pareta
 * @Since 30March2019
 */

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface BaseDAO<T extends Object> {

	Boolean save(T t);
	/*T get(int id);
	List<T> getAll();*/
	Boolean update(T t);
	Boolean delete(T t);
	Boolean deleteById(int id);
	Session getNewSession();
	void closeSession(Session session);
	
	
	
	
}
