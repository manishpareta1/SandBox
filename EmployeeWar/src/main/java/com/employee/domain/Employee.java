package com.employee.domain;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
  
@Entity  
public class Employee {  
  
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
 
 
  
}  