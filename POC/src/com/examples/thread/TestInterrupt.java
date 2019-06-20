package com.examples.thread;

public class TestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new Runnable(){
			public void run(){
				for (int i=0;i<10;i++){
					System.out.println("Runnable Thread");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();
		t.interrupt();

		for (int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}
}


