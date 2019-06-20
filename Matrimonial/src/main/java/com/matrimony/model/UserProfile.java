package com.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_detail")
public class UserProfile {
	
	@Id  
	@GeneratedValue  
	private int id;
	
	@Column(name = "first_name")  
	private String firstName;
	
	@Column(name = "last_name")  
	private String lastName;
	
	@Column(name = "email")  
	private String email;
	
	@Column(name = "phone")  
	private String phone;
	
	@Column(name = "user_name")  
	private String userName;
	
	@Column(name = "admin_role")  
	private String adminRole;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String isAdminRole(){
		return adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}

	public UserProfile() {
		super();
	}
	public UserProfile(int id, String firstName, String lastName, String email, String phone, String userName,
			String adminRole) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.adminRole = adminRole;
	}
	
	
	
	

}
