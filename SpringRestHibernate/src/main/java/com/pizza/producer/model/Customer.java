package com.pizza.producer.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUSTOMER_ID")
	private int id;
	
	@Column(name="CUST_NAME")
	@NonNull
	private String name;
	
	@Column(name="CUST_PHONE_NO")
	@NonNull
	private int phoneNo;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="customer")
	private List<PizzaOrder> orderId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<PizzaOrder> getOrderId() {
		return orderId;
	}

	public void setOrderId(List<PizzaOrder> orderId) {
		this.orderId = orderId;
	}

	public Customer(String name, int phoneNo, List<PizzaOrder> orderId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.orderId = orderId;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", orderId=" + orderId + "]";
	}

	
}
