package com.examples.collections.comparision;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overriden to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(o.name));
	}
	
	/**
	 * Comparator to sort employees list or array in order of Salary
	 */
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	    @Override
	    public int compare(Employee e1, Employee e2) {
	        return (int) (e1.getSalary() - e2.getSalary());
	    }
	};

	/**
	 * Comparator to sort employees list or array in order of Age
	 */
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

	    @Override
	    public int compare(Employee e1, Employee e2) {
	        return e1.getAge() - e2.getAge();
	    }
	};

	/**
	 * Comparator to sort employees list or array in order of Name
	 */
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

	    @Override
	    public int compare(Employee e1, Employee e2) {
	        return e1.getName().compareTo(e2.getName());
	    }
	};
	
	public static Comparator<Employee> CompareByIdAndName = new Comparator<Employee>() {
		@Override
	    public int compare(Employee o1, Employee o2) {
	        int flag = o1.getId() - o2.getId();
	        if(flag==0) flag = o1.getName().compareTo(o2.getName());
	        return flag;
	    }

	};
}



