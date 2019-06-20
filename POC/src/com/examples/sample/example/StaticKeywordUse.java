package com.examples.sample.example;

public class StaticKeywordUse {
	
	static int i=0;
	int j = 0;
	public static void staticMethod(){
		System.out.println("you are calling Static Method");
		i=10;
		
		
		
	}
	public void nonStaticMethod(){
		System.out.println("you are calling NON Static Method and will call Static Method of our class");
		i=10;j=20;
		staticMethod();
		
		System.out.println("we can call static things in non static block without any object");
	}

	/*
	 * 1. To call Non Static method you must need to have an object
	 * 2. Static methods can be called by ClassName, Object anywhere in the code.
	 * 3. Static methods can be called directly in static block
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticMethod(); //calling static method in static block
		StaticKeywordUse stat = new StaticKeywordUse();
		stat.nonStaticMethod(); // we need to create Non Static method with object itself
		stat.staticMethod();  
	}

}
