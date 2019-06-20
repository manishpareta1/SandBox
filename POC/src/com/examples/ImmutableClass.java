/*
 * 
 * Make your class final, so that no other classes can extend it.
 * Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
 * Don’t expose setter methods.
 * When exposing methods which modify the state of the class, you must always return a new instance of the class.
 * If the class holds a mutable object:
		Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
		Make sure to always return a clone copy of the field and never return the real object instance.
*/
package com.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ImmutableClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		String localName = "Manish";
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(localName, i);
		
		Student im = new Student(i, localName, map);
		System.out.println(im.getAge());
		System.out.println(im.getName());
		System.out.println(im.getNameAgeMap());
		
		i = 20;
		localName = "Pareta";
		map.put("manish", 32);
		System.out.println("*****************************************");
		System.out.println(im.getAge());
		System.out.println(im.getName());
		System.out.println(im.getNameAgeMap());
		
		Map<String, Integer> mmm = im.getNameAgeMap();
		
		mmm.put("Kamal", 20);
		System.out.println(im.getNameAgeMap());
		
		
	}
}

final class Student{
	private final int age;
	private final String name;
	private final Map<String, Integer> nameAgeMap;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Map<String, Integer> getNameAgeMap() {
		// first way
		//return new HashMap<String, Integer>(nameAgeMap);

		// second way
		return  (Map<String, Integer>) ((HashMap<String, Integer>) nameAgeMap).clone();
	}

	public Student(int age, String name, Map<String, Integer> nameAgeMap){
		this.age = age;
		this.name = name;
		Map<String, Integer> tempMap = new HashMap<String, Integer>();
		Set key;
		key = nameAgeMap.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()){
			String nameKey = it.next();
			tempMap.put(nameKey, nameAgeMap.get(nameKey));
		}
		this.nameAgeMap = tempMap;
}
}


