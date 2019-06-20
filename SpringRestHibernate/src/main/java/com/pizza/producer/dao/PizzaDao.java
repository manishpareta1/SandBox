package com.pizza.producer.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.pizza.producer.model.PizzaOrder;

public interface PizzaDao {
	
	public void placeOrder(PizzaOrder pizzaOrder) throws HibernateException;
	public void deleteOrder(Integer id) throws HibernateException;
	public List<PizzaOrder> getAllOrder() throws HibernateException;
	public PizzaOrder getCustomerOrderDetail(Integer customerId) throws HibernateException;
	public PizzaOrder getOrderDetail(Integer orderId) throws HibernateException;
	

}
