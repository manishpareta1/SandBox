package com.examples.inheritance.example;

public class SuperClass {
	
	private static int abc(){
		return 0;
	}
	
	private SuperClass(){}
	
	public static SuperClass getInstance(){
		return new SuperClass();
	}

	 void xyz(){
		 System.out.println("super class");
	 }
	
}
