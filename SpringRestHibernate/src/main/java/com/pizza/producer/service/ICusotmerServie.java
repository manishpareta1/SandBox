package com.pizza.producer.service;

import java.util.List;

import com.pizza.producer.model.Customer;

public interface ICusotmerServie {
	
	public List<Customer> getAllCustomer() throws Exception ;
	public Customer getCustomerById(Integer customerId) throws Exception ;
	public void saveCustomer(Customer customer) throws Exception ;
	public void deleteCustomer(List<Integer> idList) throws Exception ;
	public void updateCustomer(Customer customer) throws Exception;

}
