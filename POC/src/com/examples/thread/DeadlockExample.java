package com.examples.thread;

public class DeadlockExample {

	/* String str1 = "Java";
	    String str2 = "UNIX";

	    Thread trd1 = new Thread("My Thread 1"){
	        public void run(){
	            while(true){
	                synchronized(str1){
	                    synchronized(str2){
	                        System.out.println(str1 + str2);
	                    }
	                }
	            }
	        }
	    };

	    Thread trd2 = new Thread("My Thread 2"){
	        public void run(){
	            while(true){
	                synchronized(str2){
	                    synchronized(str1){
	                        System.out.println(str2 + str1);
	                    }
	                }
	            }
	        }
	    };

	    public static void main(String a[]){
	    	DeadlockExample mdl = new DeadlockExample();
	        mdl.trd1.start();
	        mdl.trd2.start();
	    }*/

	/*public static void main(String[] args) {  
	    final String resource1 = "ratan jaiswal";  
	    final String resource2 = "vimal jaiswal";  
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  

	           try { Thread.sleep(100);} catch (Exception e) {}  

	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	         }  
	      }  
	    };  

	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() {  
	      public void run() {  
	        synchronized (resource2) {  
	          System.out.println("Thread 2: locked resource 2");  

	          try { Thread.sleep(100);} catch (Exception e) {}  

	          synchronized (resource1) {  
	            System.out.println("Thread 2: locked resource 1");  
	          }  
	        }  
	      }  
	    };  


	    t1.start();  
	    t2.start();  
	  }  */

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");

				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}
	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2...");

				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	} 
}