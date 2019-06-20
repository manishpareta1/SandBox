package com.examples.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskExecuter {
	
	private final FutureTask<Loader> futureTask = new FutureTask<Loader>(new Callable<Loader>() {
		public Loader call() {
			return new Loader().loadInfo();
		}
	});
	
	private final Thread thread = new Thread(futureTask);
	
	public void start() {
		thread.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FutureTaskExecuter executer = new FutureTaskExecuter();
		executer.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Running Future in background");
		System.out.println(executer.get().toString());
		System.err.println("After executing get()");
	
	}
	
	public Loader get() {
		try {
			return futureTask.get();
		} catch (InterruptedException | ExecutionException | RuntimeException | Error e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}


class Loader{
	public Loader loadInfo() {
		System.out.println("Loading info. Please wait");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Info Loaded");
		
		return new Loader();
	}
	
	
}