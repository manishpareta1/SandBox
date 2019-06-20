package com.examples.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StandAloneTest extends MyOuterClass implements Inheritance{
	
	public static void show(Object obj) {
		try {
			File f = new File("abc");
			//InputStream in = new FileInputStream(f);
			//in.read();
			Integer i = null;
			i.floatValue();
		}catch(NullPointerException e){
			System.out.println("In catch block");
			return;
		}finally {
			System.out.println("In finally block");
		}
		System.out.println("Show Object");
	}
	public static void show(int s) {
		System.out.println("Show String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(null);
		A a = new B();
		
		try {
			doSomething();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Scanner s1 = new Scanner(System.in);
		 String intgers1 = s1.nextLine(); 
		 System.out.println(Integer.parseInt(intgers1));
	        String intgers = s1.nextLine();    
	        String[] intger = intgers.split(" ");
	        for(String string : intger) {
	        	for(int j=1; j<=Integer.parseInt(string);j++) {
	        		function(j);
	        	}
	        }
	        
	        /*for(int i =0; i<intger.length;i++) {
	        	for(int j=1; j<=Integer.parseInt(intger[i]);j++) {
	        	function(j);
	        	}
	        }*/// Reading input from STDIN
			try {
				Class c = Class.forName("StandAloneTest");
				StandAloneTest s = new StandAloneTest();
				Map<String, String> m = new HashMap<String, String>();
				s = (StandAloneTest)c.getClassLoader().loadClass("StandAloneTest").newInstance();
				s.print();
				System.out.println(m.put("M", "A"));
				System.out.println(m.put("M", "A"));
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 /*catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
		for(String s2 : args){
			System.out.println(s2);
		}
	}
	
	private void print(){
		System.out.println("Hi There!!");
	}
	
	public static void function(int i) {
		
		if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("FizzBuzz");
		}else if(i % 3 == 0) {
			System.out.println("Fizz");
		}else if(i % 5 ==0) {
			System.out.println("Buzz");
		}else {
			System.out.println(i);
		}
			
		}
	
	
	public static void doSomething() throws Error {
		try {
			throw new OutOfMemoryError();
		}catch(Error e){
			throw new Error("Out Of Memory");
		}finally {
			System.out.println("in Finally");
		}
		
	}
	
	public static void printDecimal(int[] array) {
		
	}

}

class A{
	B m1() throws NullPointerException{
		System.out.println("Inside class A");
		return null;
	}
}

class B extends A{
	B m1() throws OutOfMemoryError, ArrayIndexOutOfBoundsException{//overridden method can throw same or subclass of exception thrown by the super class method
		System.out.println("Inside class B");
		return null;
	}
}