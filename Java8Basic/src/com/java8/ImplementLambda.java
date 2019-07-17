package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ImplementLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person2 p = new Person2("Manish","Pareta",32);
		Person2 p1 = new Person2("Sanoj","Kashyap",34);
		Person2 p2 = new Person2("Ashok","Chaurasia",31);
		Person2 p3 = new Person2("Rahul","Baranwal",32);
		
		List<Person2> pList= new ArrayList<Person2>();
		
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
	private static void performConditionally(List<Person2> pList, Predicate<Person2> condition, Consumer<Person2> consume) {
		for (Person2 person : pList) {
			if(condition.test(person)) {//test() implementation is provided on line now 29 and 32 as 2nd argument 
				//System.out.println(person.toString()); replacing with Consumer
				consume.accept(person);//accept() implementation is provided on line now 29 and 32 as 3rd argument 
			}
		}
	}
}
