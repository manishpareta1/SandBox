package com.examples.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class MatchUsingMultipleThread implements Runnable{

	 private int localCounter = 0;
     private int start; // start index of search
     private int end;
     private List<String> words;
     private String token;
     public static MatchUsingMultipleThread task;
	
     public MatchUsingMultipleThread(int start, int end, List<String> words, String token) {
    	 
         this.start = start;
         this.end = end;
         this.words = words;
         this.token = token;
     }
     
     public void run() {
         for(int i = start; i < end; i++) {
        	 System.out.println("Inside Thread: "+Thread.currentThread().getName()+ " Range from: "+start+" to "+end);
        	 System.out.println("Token: "+token+ " Found: "+words.get(i));
              if(words.get(i).trim().contentEquals(token)) localCounter++;
         }
     }

     public int getCounter() { return localCounter; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calendar.getInstance().getTime());
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> list = null;
		try {
			s = new Scanner(new File("C:\\Users\\manish.pareta\\Desktop\\Manish.txt"));
			 list = new ArrayList<String>();
			while (s.hasNext()){
			    list.add(s.next());
			}
			System.out.println(list.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int j= list.size() / n;
		int r = list.size() % n;
		for(int i =0; i<n;i++){
			if(i== n-1){
				task = new MatchUsingMultipleThread(i*j, (i+1)*j + r, list, "PVDR");
				Thread t1 = new Thread(task);
				t1.setName("Thread"+i);
				System.out.println("Starting Thread: "+i);
				t1.start();
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{

				task = new MatchUsingMultipleThread(i*j, (i+1)*j, list, "PVDR");
				Thread t1 = new Thread(task);
				t1.setName("Thread"+i);
				System.out.println("Starting Thread: "+i);
				t1.start();
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//MatchUsingMultipleThread task1 = new MatchUsingMultipleThread(0, 69008, list, "GJR8C43D");
		/*MatchUsingMultipleThread task2 = new MatchUsingMultipleThread(22001, 44000, list, "Why");
		MatchUsingMultipleThread task3 = new MatchUsingMultipleThread(44001, 69008, list, "Why");*/

		// create threads
		/*Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);*/
		/*t2.setName("Thread2");
		t3.setName("Thread3");*/
		// start threads
		/*t2.start();
		t3.start();*/

		// wait for threads to finish
		/*try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

		// collect results
		int counter = 0;
		counter += task.getCounter();
		/*counter += task2.getCounter();
		counter += task3.getCounter();*/
		
		
		System.out.println("Thread 1 "+task.getCounter());
		/*System.out.println("Thread 2 "+task2.getCounter());
		System.out.println("Thread 3 "+task3.getCounter());*/
		System.out.println("Total "+counter);
		System.out.println(Calendar.getInstance().getTime());
	}
	
	

}
