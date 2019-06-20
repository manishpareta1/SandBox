package com.examples.thread;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class DeamonThread {

	public DeamonThread() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Deque<Event> deque = new ArrayDeque<Event>();
		
		WriteTask write = new WriteTask(deque);
		for(int i=0;i<3;i++){
			Thread t = new Thread(                                                                                                                             );
			t.start();
		}
		ClearTask c = new ClearTask(deque);
		c.start();
	}

}
class Event{
	private Date date;
	private String event;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

}

class WriteTask implements Runnable{

	private Deque<Event> deque;
	
	public WriteTask(Deque<Event> deque){
		this.deque = deque;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			Event event = new Event();
			event.setDate(new Date());
			event.setEvent(String.format("The thread %s has generated event %d", Thread.currentThread().getId(),i));
			deque.addFirst(event);
			System.out.printf("Added Event %d in Q by %s\n", i,Thread.currentThread().getId());
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class ClearTask extends Thread{
	private Deque<Event> deque;
	public ClearTask(Deque<Event> deque){
		this.deque = deque;
		setDaemon(true);
	}

	@Override
	public void run(){
		while(true){
			Date d = new Date();
			clean(d);
		}
	}

	public void clean(Date d){
		long difference;
		boolean delete;

		if(deque.size() ==0){
			return;
		}
		delete = false;
		do{
			Event e = deque.getLast();
			difference = d.getTime() - e.getDate().getTime();
			if(difference > 10000){
				System.out.printf("Clear: %s\n",e.getEvent());
				deque.removeLast();
				delete = true;
			}
		}while(difference >10000);
		if(delete){
			System.out.printf("Clear: Size ofthe queue: %d\n", deque.size());
		}

	}
} 
