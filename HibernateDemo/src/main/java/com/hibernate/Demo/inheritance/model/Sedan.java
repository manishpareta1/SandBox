package com.hibernate.Demo.inheritance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Sedan extends Car {
	
	@Column(name="SEDAN")
	private boolean sedan;

	public Sedan(Date model, String company, int seatingCapacity, boolean sedan) {
		super(model, company, seatingCapacity);
		this.sedan = sedan;
	}

	public boolean isSedan() {
		return sedan;
	}

	public void setSedan(boolean sedan) {
		this.sedan = sedan;
	}
	public Sedan() {
		super();
	}

	@Override
	public String toString() {
		return "Sedan [sedan=" + sedan + "]";
	}
	
	
	
}
