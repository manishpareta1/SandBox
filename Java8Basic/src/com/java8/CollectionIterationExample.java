package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionIterationExample {
	
	public static void main(String[] args) {
		
		Person p = new Person("Manish","Pareta",32);
		Person p1 = new Person("Sanoj","Kashyap",34);
		Person p2 = new Person("Ashok","Chaurasia",31);
		Person p3 = new Person("Rahul","Baranwal",32);
		
		List<Person> pList= new ArrayList<Person>();
		
		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		System.out.println("***********Print All Person using for each 7***********");
		for(Person pl : pList) {
			System.out.println(pl.toString());
		}
		
		System.out.println("***********Print All Person using for each of Java 8, and lambeda***********");
		pList.forEach(System.out::println);
		
		double average = pList.stream().map(person -> person.getAge()).collect(Collectors.averagingInt(num->num));
		System.out.println(average);
	}
	

}
