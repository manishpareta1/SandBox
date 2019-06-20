package com.pizza.producer.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pizza.producer.dao.PizzaDaoImpl;
import com.pizza.producer.model.PizzaOrder;

@Service("pizzaOrderServieImpl")
public class PizzaOrderServieImpl implements IPizzaOrderServie{

	@Autowired
	private PizzaDaoImpl pizzaDaoImpl;
	
	public void placeOrder(PizzaOrder pizzaOrder) throws Exception {
		// TODO Auto-generated method stub
		pizzaDaoImpl.placeOrder(pizzaOrder);
		
	}

	public void deleteOrder(Integer id) throws Exception {
		// TODO Auto-generated method stub
		pizzaDaoImpl.deleteOrder(id);
	}

	public List<PizzaOrder> getAllOrder() throws Exception {
		// TODO Auto-generated method stub
		return pizzaDaoImpl.getAllOrder();
	}

	public PizzaOrder getCustomerOrderDetail(Integer customerId) throws Exception {
		// TODO Auto-generated method stub
		return pizzaDaoImpl.getCustomerOrderDetail(customerId);
	}

	public PizzaOrder getOrderDetail(Integer orderId) throws Exception {
		// TODO Auto-generated method stub
		return pizzaDaoImpl.getOrderDetail(orderId);
	}

}
