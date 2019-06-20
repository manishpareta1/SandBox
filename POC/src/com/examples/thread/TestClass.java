package com.examples.thread;

/*import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;*/

//@ThreadSafe
class TestClass {/*
//	@GuardedBy("TestClass.this") private static boolean ready;
//	@GuardedBy("TestClass.this") private static int number;
	
	
	public synchronized static boolean isReady() {
		return ready;
	}
	public synchronized static void setReady(boolean ready) {
		TestClass.ready = ready;
	}
	public synchronized static int getNumber() {
		return number;
	}
	public synchronized static void setNumber(int number) {
		TestClass.number = number;
	}
	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready)
				Thread.yield();
			System.out.println(number);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ReaderThread r = new ReaderThread();
		r.start();
		
		number = 42;
		ready = true;
		r.join();
		System.out.println("Main Thread");
	}
*/}