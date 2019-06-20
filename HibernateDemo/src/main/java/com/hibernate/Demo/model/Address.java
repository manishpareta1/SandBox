package com.hibernate.Demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * Note: Class annotated with @Embeddedble need not to be mentioned as mapping property in hibernate config file
 * Only Class annotated with @Entity is required to be mentioned. 
 */
@Embeddable
public class Address {
	
	@Column(name="CITY_NAME")
	private String city;
	
	@Column(name="STREET_NAME")
	private String street;
	
	@Column(name="COUNTRY_NAME")
	private String country;
	
	@Column(name="PINCODE_NAME")
	private int pinCode;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String city, String street, String country, int pinCode) {
		super();
		this.city = city;
		this.street = street;  
		this.country = country;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	

}
