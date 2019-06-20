package com.examples.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Students> studentList = new ArrayList<Students>();

		studentList.add(new Students(1, "Partha", "ComputerScience"));
		studentList.add(new Students(2, "Manish", "InformationTechnology"));
		studentList.add(new Students(3, "Vinay", "ComputerScience"));

		//1. Iterating through enhanced for loop		
		for(Students s : studentList){
			System.out.println(s.toString());
		}
		System.out.println("***********************************");

		//2. Iterator 
		Iterator studentIter = studentList.iterator();
		while(studentIter.hasNext()){
			System.out.println(studentIter.next());
		}
		System.out.println("***********************************");
		//3. ListIterator 
		Iterator studentListIter = studentList.listIterator();
		while(studentIter.hasNext()){
			System.out.println(studentIter.next());
		}


	}

}
