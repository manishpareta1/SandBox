package com.examples.collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.examples.java.model.Employee;

/**
 * @author manish.pareta
 * It is same as HashMap instead maintains insertion order
 *
 */
public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> linkedHashMap = new LinkedHashMap<Integer, Employee>();
		
		//Maintaining Insertion Ordre
		linkedHashMap.put(1, new Employee(1, "Manish"));
		linkedHashMap.put(3, new Employee(3, "Gaurav"));
		linkedHashMap.put(2, new Employee(2, "Vinay"));
		System.out.println(linkedHashMap);
		
		
	}

}
