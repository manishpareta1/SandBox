package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import com.java8.Person;

public class FlatMapperExample {
	
	public static void main(String[] args) {
		List<NewUser> uList= Arrays.asList(
				new NewUser("Manish",32,Arrays.asList("1","2")),
				new NewUser("Rahul Baranwal",39,Arrays.asList("3","4")),
				new NewUser("Golu Chaurasia",45,Arrays.asList("5","6")),
				new NewUser("Sanoj Kashwap",35,Arrays.asList("7","8"))
				);
		System.out.println("#1 - This is how process list Java 8.");
		
		/*
		 * map method returns Stream object which needs a final action method call. 
		 * In below example action method is forEach() to print all the element of the phoneNumber list returned by the stream
		 */
		uList.stream()
		.map(new Function<NewUser, Object>() {
			@Override
			public List<String> apply(NewUser t) {
				// TODO Auto-generated method stub
				return t.getPhoneNumbers();
			}
		}).forEach(System.out::println);
		
		// re writing the above code by using lambda exp for Function 
		System.out.println("#2 - This is how process list Java 8- re written using lambda exp.");
		uList.stream()
		.map((Function<NewUser, Object> )user -> user.getPhoneNumbers()).forEach(System.out::println);
		
		System.out.println("#3 - This is how process list Java 8- processing the list returned using stream and flatMap again");
		Optional<Object> optional = uList.stream()
		.map(user -> user.getPhoneNumbers().stream())
		.flatMap(new Function<Stream<String>, Stream<?>>(){

			@Override	
			public Stream<?> apply(Stream<String> t) {
				// TODO Auto-generated method stub
				return t.filter(phoneNo -> phoneNo.equals("5"));
			}
			
		})
		.findAny();
		
		optional.ifPresent(System.out::println);
		
		System.out.println("#4 - This is how process list Java 8- processing the list returned using stream and flatMap again using Lambda");
		/*
		 * Optional, a Wrapper class helps us in having null checks of conditional validations where we want to execute some piece of code based on the some
		 * conditions, like conditional operators.
		 */
		
		Optional<String> optional1 = uList.stream()
		.map(user -> user.getPhoneNumbers().stream())
		.flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5")))
		.findAny();
		
		optional1.ifPresent(System.out::println);
		
		//optional1.of(value) this tells if the object is not nullable
		//optional1.ofNullable(value) this tells if the object is of type null
	}
	
	
	
	
	public static boolean isStartsWithR(Person p) {
		return p.getFirstName().startsWith("R");
	}

}


class NewUser{
	
	private String name;
	private int age;
	private List<String> phoneNumbers;
	
	
	
	public NewUser(String name, int age, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
	}
	
	
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
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
		return "User [name=" + name + ", age=" + age + "phoneNumber="+ phoneNumbers +"]";
	} 
	
	
}