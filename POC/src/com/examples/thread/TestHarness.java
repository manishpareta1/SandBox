package com.examples.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TestHarness {
	public static long timeTasks(int nThreads, final Runnable task)
			throws InterruptedException {
		final CountDownLatch startGate = new CountDownLatch(3);
		final CountDownLatch endGate = new CountDownLatch(nThreads);
		for (int i = 0; i < nThreads; i++) {
			Thread t = new Thread() {
				public void run() {
					try {
						startGate.await();
						try {
							task.run();
						} finally {
							endGate.countDown();
						}
					} catch (InterruptedException ignored) { }
				}
			};
			t.start();
		}
		long start = System.nanoTime();
		startGate.countDown();
		startGate.countDown();
		startGate.countDown();
		
		endGate.await(10,TimeUnit.SECONDS);
		long end = System.nanoTime();
		return end-start;
	}
	
	public static void main(String[] arr) throws InterruptedException {
		
		System.out.println("Time taken to complete the process: "+timeTasks(10, new LogInfo()));
	}
}

class LogInfo implements Runnable{

	@Override
	public void run() {
		System.out.println("This is a log");
		
	}
	
}