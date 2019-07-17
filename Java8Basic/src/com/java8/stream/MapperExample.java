package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.Person2;

public class MapperExample {
	
	public static void main(String[] args) {
		List<Person2> pList= Arrays.asList(
				new Person2("Manish","Pareta",32),
				new Person2("Sanoj","Kashyap",34),
				new Person2("Ashok","Chaurasia",31),
				new Person2("Rahul","Baranwal",32)
				);
		System.out.println("This is how process list before Java 8.");
		for(Person2 p : pList) {
			if(isStartsWithR(p)) {
				System.out.println(p.toString());
			}
		}
		System.out.println("Using Java 8---------");
		System.out.println("Using Java 8| 1. usnig Lambda Exp");
		//Using Java 8---------
		pList.stream().filter(p -> p.getFirstName().startsWith("R")).forEach(p -> System.out.println(p.toString()));
		System.out.println("Using Java 8| 2. Using Method Reference");
		pList.stream().filter(MapperExample::isStartsWithR).forEach(System.out::println);

		System.out.println("Using Java 8| 3. Using Mapper #1");//Mappers are used to create differnt objects using Lambda
		pList.stream()
		.filter(MapperExample::isStartsWithR)
		.map(new Function<Person2, User>() {

			@Override
			public User apply(Person2 t) {
				User u = new User(t.getFirstName(),t.getAge());
				return u;
			}
		})
		.forEach(System.out::println);
		System.out.println("Using Java 8| 3. Using Mapper #2");
		pList.stream()
		.filter(MapperExample::isStartsWithR)
		.map(p-> {
			return new User(p.getFirstName(),p.getAge());
		})
		.forEach(System.out::println);
		
		System.out.println("Using Java 8| 3. Using Mapper #3");
		pList.stream()   
		.filter(MapperExample::isStartsWithR)
		//.map(p-> new User(p.getFirstName(),p.getAge()))/                                                                                                                             /More than one parameter 
		.map(p-> new User(p.getFirstName(),p.getAge()))
		.forEach(System.out::println);
		
		pList.stream()
		.filter(MapperExample::isStartsWithR)
		//.map(p-> new User(p.getFirstName(),p.getAge()))/                                                                                                                             /More than one parameter 
		.map(p-> new User(p.getFirstName(),p.getAge()))
		.forEach(System.out::println);
		
		List<User> uList = pList.stream()
		.filter(MapperExample::isStartsWithR)
		//.map(p-> new User(p.getFirstName(),p.getAge()))/                                                                                                                             /More than one parameter 
		.map(p-> new User(p.getFirstName(),p.getAge())).collect(Collectors.toList());
	}
	
	public static boolean isStartsWithR(Person2 p) {
		return p.getFirstName().startsWith("R");
	}

}


class User{
	
	private String name;
	private int age;
	
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	} 
	
	
}