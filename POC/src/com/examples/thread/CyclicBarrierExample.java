package com.examples.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+ " has started");
		
		CyclicBarrier barrier = new CyclicBarrier(4);
		
		Passanger p1 = new Passanger(barrier, 1000, "Manoj");
		Passanger p2 = new Passanger(barrier, 2000, "Manish");
		Passanger p3 = new Passanger(barrier, 3000, "Nikhil");
		Passanger p4 = new Passanger(barrier, 4000, "Piyu");
		
		Passanger p5 = new Passanger(barrier, 1000, "Namrata");
		Passanger p6 = new Passanger(barrier, 2000, "Meeta");
		Passanger p7 = new Passanger(barrier, 3000, "Ritika");
		Passanger p8 = new Passanger(barrier, 4000, "Swapnil");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
	}

}

class Passanger extends Thread{
	private CyclicBarrier barrier;
	private int duration;

	public Passanger(CyclicBarrier barrier, int duration, String tName) {
		super(tName);
		this.barrier = barrier;
		this.duration = duration;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+ " has arrived.");

			int await = barrier.await();
			if(await == 0)
				System.out.println("Four Passangers has arrived. Cab can start now");
		}catch(InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
	
	
	
