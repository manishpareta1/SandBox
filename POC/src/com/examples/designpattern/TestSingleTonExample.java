package com.examples.designpattern;

/**
 * Use or Significance of Singleton class
 * 
 * Singleton is required where you want to have only one instance of a class and dont want to that whole 
 * app should use same parameters associated with that class during the application life time
 * 
 * Examples:-
 * 1. Runtime class in java is a singleton class. During the whole life cycle of JVM we are suppose to use this instnace with
 * associated parameters with it
 * 
 * 2. logger Class - if we want to have same level of logging to happen in our app, we can use logger manager class as singleton
 * 
 * 3. If Implementing Cache- If we want to implement Cache concept and load our application with some set of specific data 
 * which can be accessible during the life time of application, we can have a singleton for such implementation class
 * 
 * 4. DB/File Resource - we can make singleton object of classes which has our DB connection details, this will reduce to create
 * multiple objects with same connection details. Same can be done for a class which loads some data from property file.
 * 
 * 5. advantage over creating a full static class is we have the flexiblity of Inheritance.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class SingleTonExample implements Serializable, Cloneable{
	
	/**
	 * Type1. Eager initialization( means initializing even before the instance is required. this has disadvantage that if 
	 * Initialization fails during class initialization then we will not have object of this class.
	 */
	private static SingleTonExample s = new SingleTonExample();
	
	/**
	 * Rule 1. 	Make sure there is only one instance of the class is available i.e. make constructor as private.
	 * So that only class has access to create its instance.
	 * 
	 */
	private SingleTonExample() throws RuntimeException{
		/**
		 * below code is to fix reflection api call issue. we should not allow user to create instance by using Reflection API constructor
		 * we should not return the instance directly, as we are already doing Eager initialization we should put null check for instance
		 * add throw error if it is not null.
		 */
		if(s != null){
			throw new RuntimeException("Cannot instantiate using private constructor, please use getInstance to get object of "
					+ "this class");
		}
	}
	 /**
	  * Rule 2. Provide a global point of access to get the instance of the class	
	  * 
	  */
	public static SingleTonExample getInstance(){
		
		return s;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		//below code will allow to create a clone of the object which violates the singleton contract
		//There are 2 ways to handle Clone creation
		//return super.clone();
		/**
		 * 1. Throw an exception CloneNotSupported from clone method 
		 * 2. Return existing instanse of the class rather than making call to super.clone()
		 */
		//Solu1. 
		throw new  CloneNotSupportedException("This is a singleton class, cannot clone it");
		
		//Solu2.
		//return s;
	}
	
	/**
	 * This implementation is to fix issue in #2 implementation using Serialization.
	 * Just after de-serialization there is method provided by readResolve() which can be used to change the behavior
	 * during de-serialization. 
	 * 
	 * By implementing below method we are making sure that we are returning same instance which was created earlier
	 * during the class loading
	 */
	private Object readResolve() throws ObjectStreamException{
		
		return s;
	}
	
	}

public class TestSingleTonExample{
	public static void main(String[] args) throws Exception {
		SingleTonExample s1 = SingleTonExample.getInstance();
		SingleTonExample s2 = SingleTonExample.getInstance();
		print("S1" , s1);
		print("S2", s2);
		
		//#1. Breaking Singleton using reflection API
		try {
			Class c = Class.forName("com.examples.designpattern.SingleTonExample");
			Constructor<SingleTonExample> con = c.getDeclaredConstructor();
			con.setAccessible(true);
			SingleTonExample s3 = con.newInstance();  // This will invoke constructor of class  
			print("S3", s3);
		}catch(RuntimeException re) {
			System.out.println("Exception: " +re.getMessage());
		}
		//#2.  Breaking singleton using Serialization
		try {
			ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream("C:\\Users\\manish.pareta\\Downloads\\obj.ser"));
			objs.writeObject(s1);
			ObjectInputStream obji = new ObjectInputStream(new FileInputStream("C:\\Users\\manish.pareta\\Downloads\\obj.ser"));
			SingleTonExample s4 = (SingleTonExample) obji.readObject();
			print("S4", s4);
		}catch(Exception re) {
			System.out.println("Exception: " +re.getMessage());
		}
		//#3. Breaking Singleton using clone
		try {
		SingleTonExample s5 = (SingleTonExample) s1.clone();
		print("Clone", s5);
		}catch(CloneNotSupportedException re) {
			System.out.println("Exception: " +re.getMessage());
		}
		
	}
	
	public static void print(String s, SingleTonExample obj){
		
		System.out.println(String.format("Object : %s, Hashcode: %d", s,obj.hashCode()) );
		
	}
}
