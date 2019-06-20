package com.examples.collections.comparision;

import java.util.Arrays;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] empArr = new Employee[5];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		empArr[4] = new Employee(1, "Kankaj", 39, 7000);
		
		System.out.println("Comparing based on Name");
		Arrays.sort(empArr);
		for(Employee emp : empArr){
			System.out.println(emp.toString());
		}
		//Age Comparator
		System.out.println("Comparing based on Age");
		Arrays.sort(empArr, Employee.AgeComparator);
		for(Employee emp : empArr){
			System.out.println(emp.toString());
		}
		System.out.println("CompareByIdAndName");
		Arrays.sort(empArr, Employee.CompareByIdAndName);
		for(Employee emp : empArr){
			System.out.println(emp.toString());
		}
		
		System.out.println("Comparing based on Salary");
		Arrays.sort(empArr, Employee.SalaryComparator);
		for(Employee emp : empArr){
			System.out.println(emp.toString());
		}
	}

}
