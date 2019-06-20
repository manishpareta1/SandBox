package com.examples.inheritance.example;

public class SubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		//SuperClass ss = new SubClass();
		s.xyz();
		//ss = new SubClass();
		//ss.xyz();
		SuperClass.getInstance().xyz();
	}
	
	public void xyz(){
		System.out.println("subclass");
	}
	
	private static int abc(){
		return 4;
	}
}
