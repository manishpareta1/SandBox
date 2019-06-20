package com.pizza.producer.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pizza.producer.model.Customer;

@Repository("customerDaoImpl")
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<Customer> getAllCustomer() throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		List<Customer> customerList = null;
		try {
			Criteria criteria = session.createCriteria(Customer.class);
			customerList = criteria.list();
			if(customerList == null || customerList.size()<=0) 
				throw new HibernateException("Sorry!! Customer data not found");
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Customer Details");
		}
		return customerList;
	}
		
		
	

	public Customer getCustomerById(Integer customerId) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		Customer customer = null;
		 try {
			 Criteria criteria = session.createCriteria(Customer.class)
					 .add(Restrictions.eq("customerId", customerId));
			 if(criteria.list() != null && criteria.list().size()>0) {
				 customer = (Customer) criteria.list().get(0);
			 }else {
				 throw new HibernateException("Sorry!! Customer data not found for id: "+customerId);
			 }
		 }catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while looking up for Customer Details");
		 }
		
		return null;
	}

	public void saveCustomer(Customer customer) throws HibernateException {
		// TODO Auto-generated method stub
		
		Session session = getSession();
		try {
			session.beginTransaction();
			session.save(customer);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while saving Customer Details");
		}finally {
			session.close();
		}
		
	}

	public void deleteCustomer(List<Integer> idList) throws HibernateException {
		Session session = getSession();
		try {
			session.beginTransaction();
			session.delete(idList);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while saving Customer Details");
		}finally {
			session.close();
		}
		
	}

	public void updateCustomer(Customer customer) throws HibernateException {
		// TODO Auto-generated method stub
		Session session = getSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(customer);
			session.getTransaction().commit();
		}catch(HibernateException e) {
			throw new HibernateException("Some Exception Occured while update Customer Details");
		}finally {
			session.close();
		}
		
	}

}
