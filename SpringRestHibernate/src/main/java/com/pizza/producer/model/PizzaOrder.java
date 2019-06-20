package com.pizza.producer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;


@Entity
@Table(name="PIZZA_ORDER")
public class PizzaOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ORDER_ID")
	private int pizzaId;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name="ORDER_TIME")
	@NonNull
	private Date recordCreationDate;
	
	@Column(name="SIZE")
	@NonNull
	private String pizzaSize;
	
	@Column(name="STATUS")
	private String pizzaStatus;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public Date getRecordCreationDate() {
		return recordCreationDate;
	}

	public void setRecordCreationDate(Date recordCreationDate) {
		this.recordCreationDate = recordCreationDate;
	}

	public String getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getPizzaStatus() {
		return pizzaStatus;
	}

	public void setPizzaStatus(String pizzaStatus) {
		this.pizzaStatus = pizzaStatus;
	}

	public PizzaOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PizzaOrder(Date recordCreationDate, String pizzaSize, String pizzaStatus) {
		super();
		this.recordCreationDate = recordCreationDate;
		this.pizzaSize = pizzaSize;
		this.pizzaStatus = pizzaStatus;
	}

	@Override
	public String toString() {
		return "PizzaOrder [pizzaId=" + pizzaId + ", recordCreationDate=" + recordCreationDate + ", pizzaSize="
				+ pizzaSize + ", pizzaStatus=" + pizzaStatus + "]";
	}
	
	

}
