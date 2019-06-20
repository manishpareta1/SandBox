package com.examples.thread;

import java.math.BigDecimal;

public class ThreadLocalDemo extends Thread{
	
	static volatile Integer custId = 0;
	//static Integer custId = 0;
	
	private static ThreadLocal tl = new ThreadLocal(){
		
		public synchronized Integer initialValue(){
			return ++custId;
		}
		/*public Integer initialValue(){
			return ++custId;
		}*/
	};

	public ThreadLocalDemo(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+ " executing with Customer Id: "+tl.get());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocalDemo customer1 = new ThreadLocalDemo("Customer Thread-1");
		ThreadLocalDemo customer2 = new ThreadLocalDemo("Customer Thread-2");
		ThreadLocalDemo customer3 = new ThreadLocalDemo("Customer Thread-3");
		ThreadLocalDemo customer4 = new ThreadLocalDemo("Customer Thread-4");
		customer1.start();
		customer2.start();
		customer3.start();
		customer4.start();
		
		BigDecimal rate = new BigDecimal(123456);
	    String decimal = "4";
	    int a = 1;
	    for( int i=0; i<new Integer(decimal);i++){
	    	a *= 10;
	    }
	    BigDecimal tens = new BigDecimal(a);
	    BigDecimal percentageFactor =
	    		rate.divide(tens);//(hundred,2, BigDecimal.ROUND_HALF_UP);

	    System.out.println("final value:"+ percentageFactor);
		
	}

}
