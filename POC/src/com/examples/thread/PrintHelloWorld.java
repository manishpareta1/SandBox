package com.examples.thread;

public class PrintHelloWorld {
	
	public boolean flag;
	public int count = 0;
	public  void printHello(){
		System.out.print("Hello ");
	}
	
	public  void printWorld(){
		System.out.print("World, ");
	}
	
	public static void main(String[] args){
		PrintHelloWorld p = new PrintHelloWorld();
		p.flag = true;
		
		A a = new A(p);
		B b = new B(p);
		
		Thread aT = new Thread(a);
		Thread bt = new Thread(b);
		
		aT.start();
		bt.start();
	}
}

class A implements Runnable{
	PrintHelloWorld p; 
	public A(PrintHelloWorld p){
		this.p = p;
	}
	public void run(){
		synchronized (p) {
			while(p.flag == true && p.count++ != 100){
				p.printHello();
				try {
					p.flag = false;
					Thread.sleep(1000);
					p.notify();
					p.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
	
class B implements Runnable{
	PrintHelloWorld p; 
	public B(PrintHelloWorld p){
		this.p = p;
	}
	public void run(){
		synchronized (p) {
			while(p.flag == false && p.count++ != 100){
				p.printWorld();
				p.flag = true;
				try {
					Thread.sleep(1000);
					p.notify();
					p.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
