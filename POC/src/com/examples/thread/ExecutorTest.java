package com.examples.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {
	
	private static Executor executor = null;
	private static Future futureTaskOne = null;
	private static Future futureTaskTwo = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		executor = Executors.newFixedThreadPool(2);
		
		while(true) {
			checkStatus();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void checkStatus() {
		if(futureTaskOne == null || futureTaskOne.isDone() || futureTaskTwo.isCancelled()) {
			executor.execute(new TaskOne());
		}
		
		if(futureTaskTwo == null || futureTaskTwo.isDone() || futureTaskTwo.isCancelled()) {
			executor.execute(new TaskTwo());
		}
		
	}

}

class TaskOne implements Runnable{
	
	protected boolean taskExecuted = false;

	@Override
	public void run(){
		System.out.println("Executing TaskOne....");
		try {
			Thread.sleep(12000);
			System.out.println("TaskOne Completed!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		taskExecuted = true;
	}
}

class TaskTwo implements Runnable{
	
	protected boolean taskExecuted = false;

	@Override
	public void run(){
		System.out.println("Executing TaskTwo....");
		try {
			Thread.sleep(10000);
			System.out.println("TaskTwo Completed!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		taskExecuted = true;
	}
}
