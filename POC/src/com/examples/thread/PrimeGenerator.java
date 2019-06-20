package com.examples.thread;

public class PrimeGenerator extends Thread{

	public PrimeGenerator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new PrimeGenerator();
		t.start();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		t.interrupt();
		System.out.println("Invoked interrupt method, continuening with Main thread execution");

	}
	
	public void run(){
		long number = 177L;
		while(true){
			if(isPrimeNumber(number)){
				System.out.printf("Number %d is Prime", number);
				System.out.println("");
			}

			if(isInterrupted()){
				System.out.printf("The Prime Generator has been Interrupted");
				return;
			}
			number++;
		}

	}
	
	public boolean isPrimeNumber(long number){
		if(number <=2)
			return true;
		for(int i=2; i<number; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	

}
