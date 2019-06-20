package com.examples;

public class TestSingleton {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton{
	
	private static Singleton singleton;
	
	private Singleton(){
		if(singleton != null){// This check is to prevent creating new instance using reflection api
			throw new RuntimeException("Cannot Instantiate using private constructore");
		}
	}
	
	public static Singleton getInstance(){
		
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null)
					singleton = new Singleton();
			}
		}
		
		return singleton;
	} 
}