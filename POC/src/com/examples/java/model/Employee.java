package com.examples.java.model;

public class Employee{

	int id;
	String name;

	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
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





	@Override
	public String toString(){
		return this.id + "-" + this.name;
	}
	
	
	@Override
	public boolean equals(Object o){

		if(o == this )
			return true;

		if(!(o instanceof Employee ))
			return false;
		Employee emp = (Employee) o;


		return emp.name.equals(name) && emp.id == id;
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + name.hashCode();
		return result;
	}
}