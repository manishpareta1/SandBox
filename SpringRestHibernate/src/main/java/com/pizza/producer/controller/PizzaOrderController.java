package com.pizza.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.producer.model.PizzaOrder;
import com.pizza.producer.service.PizzaOrderServieImpl;

@RestController
public class PizzaOrderController {

	@Autowired
	private PizzaOrderServieImpl pizzaOrderServieImpl;
	
	@RequestMapping(value="/newOrder/", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> placeOrder(@RequestBody PizzaOrder pizzaOrder) {
		String errorMsg = "";
		try {
			pizzaOrderServieImpl.placeOrder(pizzaOrder);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		return new ResponseEntity<Boolean>(false,HttpStatus.PRECONDITION_FAILED);
	}
	
	@RequestMapping(value="/deleteOrder/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteOrder(@PathVariable("id") Integer id) {
		
		String errorMsg = "";
		
		try {
			pizzaOrderServieImpl.deleteOrder(id);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errorMsg = e.getMessage();
		}
		
		return new ResponseEntity<Boolean>(false,HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/getAllOrder", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<PizzaOrder> getAllOrder() {
		
		List<PizzaOrder> pizzaOrders = null;
		String errorMsg = "";
		try {
			pizzaOrders = pizzaOrderServieImpl.getAllOrder();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errorMsg = e.getMessage();
		}
		return pizzaOrders;
		
	}
	
	@RequestMapping(value="/getCustomerOrderDetail/{customerId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PizzaOrder> getCustomerOrderDetail(@PathVariable("customerId") Integer customerId) {
		PizzaOrder order = new PizzaOrder();
		String errorMsg = "";
		try {
			order = pizzaOrderServieImpl.getCustomerOrderDetail(customerId);
			return new ResponseEntity<PizzaOrder>(order, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		order.setPizzaId(-1);
		return new ResponseEntity<PizzaOrder>(order, HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/getOrderDetail/{orderId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PizzaOrder> getOrderDetail(@PathVariable("orderId") Integer orderId) {
		PizzaOrder order = new PizzaOrder();
		String errorMsg = "";
		try {
			order = pizzaOrderServieImpl.getOrderDetail(orderId);
			return new ResponseEntity<PizzaOrder>(order, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		order.setPizzaId(-1);
		return new ResponseEntity<PizzaOrder>(order, HttpStatus.NOT_FOUND);
	} 
}
