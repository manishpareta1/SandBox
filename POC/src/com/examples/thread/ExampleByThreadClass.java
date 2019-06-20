package com.examples.thread;

public class ExampleByThreadClass extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleByThreadClass t = new ExampleByThreadClass();
		t.start();
		
		System.out.println(t.getName());
		
		try {
			t.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("In Main method");
		
	}
	@Override
	public void run(){
		System.out.println("my First Thread" );
	}
}
