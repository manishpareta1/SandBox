package com.hibernate.Demo.inheritance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//SingleTable Strategy

/*@DiscriminatorValue("HatchBack")*/
public class HatchBack extends Car {
	
	@Column(name="HATCHBACK")
	private boolean hatchBack;

	public boolean isHatchBack() {
		return hatchBack;
	}

	public void setHatchBack(boolean hatchBack) {
		this.hatchBack = hatchBack;
	}

	public HatchBack(Date model, String company, int seatingCapacity, boolean hatchBack) {
		super(model, company, seatingCapacity);
		this.hatchBack = hatchBack;
	}

	public HatchBack() {
		super();
	}

	@Override
	public String toString() {
		return "HatchBack [hatchBack=" + hatchBack + "]";
	} 
	
	

}
