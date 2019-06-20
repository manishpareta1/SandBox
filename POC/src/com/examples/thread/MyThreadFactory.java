package com.examples.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class MyThreadFactory implements ThreadFactory{

	private int counter;
	private String name;
	private List<String> stats;
	
	public MyThreadFactory(String name){
		counter = 0;
		this.name= name;
		stats= new ArrayList<String>();
	}

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(r, name+" - Thread_"+counter++);
		stats.add(String.format("Created Thread %d with name %s on %s\n", t.getId(),t.getName(),new Date()));
		return t;
	}
	
	public String getStats(){
		StringBuffer buffer = new StringBuffer();
		Iterator<String> itr = stats.iterator();
		
		while(itr.hasNext()){
			buffer.append(itr.next());
			buffer.append("\n");
		}
		return buffer.toString();
	}
	
	public static void main(String[] agrs){
		MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
		Task task = new Task();
		Thread thread;
		System.out.println("Starting Threads \n");
		for(int i=0;i<10;i++){
			thread = factory.newThread(task);
			thread.start();
		}
		
		System.out.printf("Factory Stats: \n");
		System.out.printf("%s\n",factory.getStats());
	}
}

class Task implements Runnable{
	
	public void run(){
		try{
			TimeUnit.SECONDS.sleep(3);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
