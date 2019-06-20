package com.examples.designpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletoneLazyinit {
	
	private static volatile SingletoneLazyinit s = null;
	
	private SingletoneLazyinit(){}
	
	/**
	 * This is called Lazy  Initialization of Singleton object
	 * During Double check initialization there is a possibility that a half initilaized object is published to other threads
	 * and hence other thread can see half initialization
	 * @return
	 */
	public static SingletoneLazyinit getInstance(){
		//#1 to fix Singleton issue for multithreaded implementation
		if(s == null){ 	//Single Check for singleton 
			synchronized (SingletoneLazyinit.class) {
				if(s == null){// Double Check for singleton also know as double check Locking
					s = new SingletoneLazyinit();
				}
			}
		}
		//#2. This is holder pattern implementation for multithreaded env for singleton class
		/**
		 * this will always return same instance of singleton class
		 * return Holder.INSTANCE;
		 */
		try {
			s.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s; 
	}
	
	//#2 We can use Holder pattern also to create Singleton 
	static class Holder{
		static SingletoneLazyinit INSTANCE = new SingletoneLazyinit();
	}
	

	
}
/**
 * #3 Using ENUM implementation
 * this will restrict all type of Singleton hacks.
 * 
 */
	enum SingletoneLazyinite{
		INSTANCE;
		public String getConfiguration(){return "singleton";}
	}


class TestC{
	
	public static void useSingleton(){
		
		SingletoneLazyinit s1 = SingletoneLazyinit.getInstance();
		//#3 Using Enum to create instance
		//SingletoneLazyinite s1 = SingletoneLazyinit.INSTNCE;
		print("lazy", s1);
		/*try {
		s1.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
	}
	public static void print(String s, SingletoneLazyinit obj){
		
		System.out.println(String.format("Object : %s, Hashcode: %d", s,obj.hashCode()) );
		
	}
	
	public static void main(String[] args) {
		
		//Breaking Singleton using multipile Threads
		ExecutorService  service = Executors.newFixedThreadPool(2);
		service.submit(TestC::useSingleton);
		service.submit(TestC::useSingleton);
		
		service.shutdown();
		
		
	}
}
