package com.pizza.producer.service;

import java.util.List;

import org.hibernate.HibernateException;

import com.pizza.producer.model.PizzaOrder;

public interface IPizzaOrderServie {
	
	public void placeOrder(PizzaOrder pizzaOrder) throws Exception;
	public void deleteOrder(Integer id) throws Exception;
	public List<PizzaOrder> getAllOrder() throws Exception;
	public PizzaOrder getCustomerOrderDetail(Integer customerId) throws Exception;
	public PizzaOrder getOrderDetail(Integer orderId) throws Exception;

}
