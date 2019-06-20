package com.pizza.producer.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.pizza.producer.model.Customer;

public interface CustomerDao {
	
	public List<Customer> getAllCustomer() throws HibernateException ;
	public Customer getCustomerById(Integer customerId) throws HibernateException ;
	public void saveCustomer(Customer customer) throws HibernateException ;
	public void deleteCustomer(List<Integer> idList) throws HibernateException ;
	public void updateCustomer(Customer customer) throws HibernateException;
	

}
