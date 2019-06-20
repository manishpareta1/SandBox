package com.pizza.producer.controller;

import java.util.ArrayList;
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

import com.pizza.producer.model.Customer;
import com.pizza.producer.service.CustomerServieImpl;

@RestController
public class CustomerController {
	
	@Autowired
	public CustomerServieImpl customerServiceImpl;
	
	@RequestMapping(value="/getAllCustomer", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer() {
		String errorMsg = new String("");
		List<Customer> customers = new ArrayList<Customer>();
		try {
			customers = customerServiceImpl.getAllCustomer();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		return customers;
	}
	
	@RequestMapping(value="/getCustomer/{customerId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomerById(@PathVariable("customerId") Integer customerId) {
		String errorMsg = new String("");
		Customer customer = null;
		try {
			customer = customerServiceImpl.getCustomerById(customerId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		
		return customer;
		}
	
	@RequestMapping(value="/saveCustomer", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveCustomer(@RequestBody Customer customer) {
		String errorMsg = new String("");
		try {
			customerServiceImpl.saveCustomer(customer);
			return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		
		return new ResponseEntity<Boolean>(false,HttpStatus.PRECONDITION_FAILED);
	}
	
	@RequestMapping(value="/deleteCustomer", method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> deleteCustomer(@RequestBody List<Integer> idList) {
		String errorMsg = new String("");
		try {
			customerServiceImpl.deleteCustomer(idList);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		
		return new ResponseEntity<Boolean>(false,HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/updateCustomer", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		String errorMsg = new String("");
		try {
			customerServiceImpl.updateCustomer(customer);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMsg = e.getMessage();
			e.printStackTrace();
		}
		return new ResponseEntity<Customer>(customer,HttpStatus.NOT_FOUND);
	}

}
