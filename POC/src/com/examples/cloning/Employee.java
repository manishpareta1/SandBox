package com.examples.cloning;

import java.util.Date;

public class Employee implements Cloneable{

	private int id;
	private String name;
	private Department dept;
	private Date joiningDate;

	public Employee(int id, String name, Department dept){
		this.id=id;
		this.name = name;
		this.dept = dept;
		this.joiningDate = new Date();

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee)super.clone();
		cloned.setDept((Department)cloned.getDept().clone());// Deep Cloning
		return cloned;
	}

	
	/*Deep Copy trick 1.
	 * 
	 * 
	 * 	Collection<Employee> copy = new HashSet<Employee>(org.size()); 
	 *	Iterator<Employee> iterator = org.iterator(); 
	 * 	while(iterator.hasNext()){ copy.add(iterator.next().clone()); }
	 * 
	 * 
	 */

	/*
	 * Deep Copy Conventional way
	 * 
	 * @Override 
	 * protected Employee clone() { 
	 * Employee clone = null; 
	 * 	try{ 
	 * 		clone = (Employee) super.clone(); 
	 * 		}catch(CloneNotSupportedException e){ 
	 * 				throw new RuntimeException(e); // won't happen } 
	 * return clone; }
	 */


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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date date) {
		this.joiningDate = date;
	}

	}
