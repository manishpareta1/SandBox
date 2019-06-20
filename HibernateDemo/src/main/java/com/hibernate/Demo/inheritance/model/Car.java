package com.hibernate.Demo.inheritance.model;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
/*@NamedQuery(name="Car.carDetailsById", query="from com.hibernate.Demo.inheritance.model.Car where id>?") //Will use class name and variable in HQL
@NamedQuery(name="Car.carDetailByName", query="select c from car as c where car_compny_name=?")//will use table and column name in normal SQL
*///PerClassTable Strategy
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//SingleTable Strategy
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="CAR_TYPE",
		discriminatorType = DiscriminatorType.STRING
		)*/
@Table(name="CAR")
public class Car {
	
	@Id
	@GeneratedValue
	@Column(name="CAR_ID")
	private int id;
	
	@Column(name="CAR_MODEL_DATE")
	@Temporal(TemporalType.DATE)
	private Date model;
	
	@Column(name="CAR_COMPNY_NAME")
	private String company;
	
	@Column(name="CAR_SEATING_CAP")
	private int seatingCapacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getModel() {
		return model;
	}

	public void setModel(Date model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Car(Date model, String company, int seatingCapacity) {
		super();
		this.model = model;
		this.company = company;
		this.seatingCapacity = seatingCapacity;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", company=" + company + ", seatingCapacity=" + seatingCapacity
				+ "]";
	}
	
	

}
