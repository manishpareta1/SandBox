package com.examples.collections.Map;

import java.util.Map;
import java.util.TreeMap;

import com.examples.java.model.Employee;

/*
 * TreeMap implements NavigalbeMap which returns object in sorted Order of Key 
 * 
 */

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Manish");
		Employee e2 = new Employee(2, "Vinay");
		Employee e3 = new Employee(3, "Gaurav");
		TreeMap<Integer, Employee> empMap = new TreeMap<Integer, Employee>();
		
		empMap.put(e2.getId(), e2);
		empMap.put(e1.getId(), e1);
		empMap.put(e3.getId(), e3);
		
		System.out.println(empMap.descendingKeySet());
		System.out.println(empMap.descendingMap());
		System.out.println(empMap.lowerEntry(1));
		
		for(Map.Entry<Integer, Employee> entry :empMap.entrySet()){
			
			System.out.println("Key: "+entry.getKey() +" Value: "+entry.getValue().toString());
		}
		
	}

}
