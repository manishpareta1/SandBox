package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionIterationExample {
	
	public static void main(String[] args) {
		
		Person2 p = new Person2("Manish","Pareta",32);
		Person2 p1 = new Person2("Sanoj","Kashyap",34);
		Person2 p2 = new Person2("Ashok","Chaurasia",31);
		Person2 p3 = new Person2("Rahul","Baranwal",32);
		
		List<Person2> pList= new ArrayList<Person2>();
		
		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		System.out.println("***********Print All Person using for each 7***********");
		for(Person2 pl : pList) {
			System.out.println(pl.toString());
		}
		
		System.out.println("***********Print All Person using for each of Java 8, and lambeda***********");
		pList.forEach(System.out::println);
		
		double average = pList.stream().map(person -> person.getAge()).collect(Collectors.averagingInt(num->num));
		System.out.println(average);
	}
	

}
