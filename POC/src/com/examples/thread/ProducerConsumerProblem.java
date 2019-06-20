package com.examples.thread;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerProblem {
	
	private final int maxSize =10;
	private List<?> storage;
	
	public ProducerConsumerProblem(){
		storage = new LinkedList<>();
	}

	public synchronized void set(){
		while(storage.size() == maxSize){
			try{
				System.out.println("waiting now in set");
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		((LinkedList<Date>)storage).offer(new Date());
		System.out.printf("Set - Storage size is: %d \n", storage.size());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
	}
	
	public synchronized void get(){
		while(storage.size() == 0){
			try{
				System.out.println("waiting now in get");
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.printf("Get: Storage size is %d: and value is %s \n", storage.size(),((LinkedList<Date>)storage).poll());
		notifyAll();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumerProblem storage = new ProducerConsumerProblem();
		
		JobProducer producer = new JobProducer(storage);
		JobConsumer consumer = new JobConsumer(storage);
		
		Thread pThread = new Thread(producer, "Producer");
		Thread cThread = new Thread(consumer, "Consumer");
		
		pThread.start();
		cThread.start();
	}

}

class JobProducer implements Runnable{
	
	private ProducerConsumerProblem storageQueue;
	
	public JobProducer(ProducerConsumerProblem storageQueue){
		this.storageQueue = storageQueue;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			storageQueue.set();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class JobConsumer implements Runnable{
	
	private ProducerConsumerProblem storageQueue;
	
	public JobConsumer(ProducerConsumerProblem storageQueue){
		this.storageQueue = storageQueue;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			storageQueue.get();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
