package com.examples.collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.examples.java.model.Employee;


public class BasicHashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Employee> map = new HashMap<Integer, Employee>();
		Map<String, Employee> hashMap = new HashMap();
		Map<Employee, Integer> hashMap1 = new HashMap();
		for (int i =1; i<=10; i++){
			
			map.put(i, new Employee(i+3, "Manish"+(i+3)));
		}
		System.out.println(map);
		
		Employee emp1 = new Employee(4, "Manish3");
		//Use of Contains
		System.out.println(map.containsValue(emp1)); 
		
		//Key Set
		System.out.println(map.keySet());
		
		//retrieve entry set
		System.out.println(map.entrySet());
		
		//map.forEach(action);; TO DO- need to understand this method
		

		//Returns in sorted order when Key is natural (permitives or String or Enum)
		hashMap.put("A", new Employee(1, "Manish"));
		hashMap.put("C", new Employee(3, "Gaurav"));
		hashMap.put("B", new Employee(2, "Vinay"));
		System.out.println(hashMap);
		
		//maintains insertion order when key is Object type(dont have any natural order)
		hashMap1.put(new Employee(1, "Manish"),1);
		hashMap1.put(new Employee(3, "Gaurav"),3);
		hashMap1.put(new Employee(2, "Vinay"),2);
		System.out.println(hashMap1);
		HashMap<Long, String> masterRoomPoolMapping = new HashMap<Long, String>();
		masterRoomPoolMapping.put(new Long(123), "Manish");
		masterRoomPoolMapping.put(new Long(124), "Manish");
		masterRoomPoolMapping.put(new Long(125), "Manish");
		System.out.println("***************************************************");
		Set<Long> keySet = masterRoomPoolMapping.keySet();
		Set<Long> newKeySet = new HashSet<Long>();
		for(Long key : keySet){
			newKeySet.add(new Long(key));
		}
		System.out.println("newKeySet***************************************************");
		if(newKeySet.contains(new Long(123)))
			newKeySet.remove(new Long(123));
		for(Long key : newKeySet){
			System.out.println(key);
		}
		System.out.println("keySet1***************************************************");
		Set<Long> keySet1 = masterRoomPoolMapping.keySet();
		for(Long key : keySet1){
			System.out.println(masterRoomPoolMapping.get(key));
		}
		System.out.println("***************************************************");
		System.out.println(masterRoomPoolMapping);
	}
}
