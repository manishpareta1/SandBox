package com.pizza.producer.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pizza.producer.dao.CustomerDaoImpl;
import com.pizza.producer.model.Customer;

@Service("customerServieImpl")
public class CustomerServieImpl implements ICusotmerServie{
	
	@Autowired
	public CustomerDaoImpl customerDaoImpl;

	private CustomerDaoImpl daoImpl;
	
	public List<Customer> getAllCustomer() throws Exception {
		// TODO Auto-generated method stub
		List<Customer> customers = customerDaoImpl.getAllCustomer();
		return customers;
	}

	public Customer getCustomerById(Integer customerId) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = customerDaoImpl.getCustomerById(customerId);
		return customer;
	}

	public void saveCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerDaoImpl.saveCustomer(customer);
	}

	public void deleteCustomer(List<Integer> idList) throws Exception {
		// TODO Auto-generated method stub
		customerDaoImpl.deleteCustomer(idList);
	}

	public void updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerDaoImpl.updateCustomer(customer);
	}
	

}
