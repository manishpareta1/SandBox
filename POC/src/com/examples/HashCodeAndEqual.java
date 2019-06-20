package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RecursiveAction;

public class HashCodeAndEqual {

	public HashCodeAndEqual() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Employee> empMap = new HashMap<String, Employee>();
		Employee e = empMap.put("Manish", new Employee("Manish", 50000, "Indore"));
		System.out.println(e);
		empMap.put("Piyush", new Employee("Piyush", 50000, "Indore"));
		empMap.put("Meeta", new Employee("Meeta", 50000, "Indore"));
		empMap.put("Manish", new Employee("Manish", 60000, "Indore"));
		
		Set<String> key = empMap.keySet();
		for(String s : key){
			System.out.println(empMap.get(s).toString());
		}
		
		recursiveprint(1);
		
	}
	
	public static void recursiveprint(int j){
		System.out.println(j++);
		if(j <= 100)
			recursiveprint(j);
	}
}


class Employee{
	
	private int salary;
	private String name;
	private String place;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	// Parameterized constructor
	public Employee(String name, int salary, String place){
		this.name = name;
		this.salary = salary;
		this.place = place;
	}
	
	@Override
	public String toString(){
		return this.getName() +" | "+this.getSalary()+" | "+this.getPlace();
	}
	//Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + salary;
        result = 31 * result + place.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(Object obj){
    	
    	if(obj == null){
    		return false;
    	}
    	if(obj != null && obj == this){
    		return true;
    	}
    	
    	if(obj instanceof Employee){
    		final Employee emp = (Employee) obj;
     		return ((emp.getName()!= null && emp.getName().equals(this.getName())) &&
    				(emp.getSalary() == this.getSalary()) &&
    				((emp.getPlace()!= null) && (emp.getPlace().equals(this.getPlace()))))? true : false;
    	}else{
    		return false;
    	}
    }
}