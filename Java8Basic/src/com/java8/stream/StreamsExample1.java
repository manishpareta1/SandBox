package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.java8.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> pList= Arrays.asList(
				new Person("Manish","Pareta",32),
				new Person("Sanoj","Kashyap",34),
				new Person("Ashok","Chaurasia",31),
				new Person("Rahul","Baranwal",32)
				);
		System.out.println("***********Print Person using for J8 Stream filter***********");
		pList.stream()//creates an stream
		.filter(p -> p.getFirstName().startsWith("M"))//
		.forEach(System.out::println);
		System.out.println("***********Print Person using for J8 for each***********");
		pList.forEach(System.out::println);
		
		
	}

}
