package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ImplementLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Manish","Pareta",32);
		Person p1 = new Person("Sanoj","Kashyap",34);
		Person p2 = new Person("Ashok","Chaurasia",31);
		Person p3 = new Person("Rahul","Baranwal",32);
		
		List<Person> pList= new ArrayList<Person>();
		
		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		
		Collections.sort(pList, (prsn1,prsn2) -> prsn1.getFirstName().compareTo(prsn2.getFirstName()));
		System.out.println("***********Print All Person***********");
		performConditionally(pList, person -> true, per -> System.out.println(per));
		
		System.out.println("***********Starts with M***********");
		performConditionally(pList, person -> person.getFirstName().startsWith("M"),per -> System.out.println(per));
		
		
		//performConditionally(pList, person -> true, per -> System.out.println(per));
		System.out.println("***********Print using Method Reference***********");
		performConditionally(pList, person -> true, System.out::println);//(p) -> System.out.println(p) can be replaced with System.out::println
		/*Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Processing Person list using thread");
				System.out.println();
				
			}
		});*/
		
	
	}
	/*
	 * 
	 * Please check java.util.function pkg for more default implementation Interfaces which can be very useful
	 */
	private static void performConditionally(List<Person> pList, Predicate<Person> condition, Consumer<Person> consume) {
		for (Person person : pList) {
			if(condition.test(person)) {//test() implementation is provided on line now 29 and 32 as 2nd argument 
				//System.out.println(person.toString()); replacing with Consumer
				consume.accept(person);//accept() implementation is provided on line now 29 and 32 as 3rd argument 
			}
		}
	}
}
