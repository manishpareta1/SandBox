package com.java8.comparatorAPI;

import java.util.function.Function;

public class TestComparatorAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//General Comparator implementation.
		Comparator<Person> compAge = (p1,p2) -> p2.getAge() - p1.getAge();
		Comparator<Person> compFirstName = (p1,p2) -> p2.getFirstName().compareTo(p1.getFirstName());
		Comparator<Person> compLastName = (p1,p2) -> p2.getLastName().compareTo(p1.getLastName());
		
		/*Functions to get specific value to use in comparator
		 * Function<Person, Integer> fAge = p -> p.getAge(); 
		 * Function<Person, String> fFirstName = p -> p.getFirstName(); 
		 * Function<Person, String> fLastName = p -> p.getLastName();
		 */
		//
		Comparator<Person> compareAge = Comparator.comparing(Person::getAge);
		Comparator<Person> compareFirstName = Comparator.comparing(p -> p.getFirstName());
		Comparator<Person> compareLastName = Comparator.comparing(p -> p.getLastName());
		
		//Comparison using age then first name
		Comparator<Person> comp = compareAge.thenCompare(compareFirstName);
		
		Comparator<Person> compare = Comparator.comparing(Person::getAge)
											   .thenCompare(Person::getFirstName)
											   .thenCompare(Person::getLastName);
		
		
		//getint(10,10); // ambiguity error compiler cant differentiate b/w long and int type until specifically defined like (10l,10) or (10, 10l)
		getint(10l,10);  
		getint(10,10l);
	}
	
	public static void getint(long i, int j) {
		System.out.println("Calling method from long, int");
	}
	public static void getint(int i, long j) {
		System.out.println("calling method from int,long");
	}

}
