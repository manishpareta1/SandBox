package com.examples.thread;

public class ExecuteThreadinSeq{

	public ExecuteThreadinSeq() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {

	    	ResourceLock lock = new ResourceLock();

	        ThreadA a=new ThreadA(lock);
	        ThreadB b=new ThreadB(lock);
	        ThreadC c=new ThreadC(lock);

	        a.start();
	        b.start();
	        c.start();
	    }

}

class ThreadA  extends Thread{
	public ResourceLock lock;
	public ThreadA(ResourceLock lock){
		this.lock = lock;
	}
	public void run(){
		try{
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    while(lock.flag!=1){
                        lock.wait();
                    }
                    System.out.print("Hello ");
                    Thread.sleep(1000);
                    lock.flag = 2;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception 1 :"+e.getMessage());
        }
    }
}

class ThreadB  extends Thread{
	public ResourceLock lock;
	public ThreadB(ResourceLock lock){
		this.lock = lock;
	}
	
	public void run(){
		try{
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    while(lock.flag!=2){
                        lock.wait();
                    }
                    System.out.print("World ");
                    Thread.sleep(1000);
                    lock.flag = 3;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception 2 :"+e.getMessage());
        }
    }
}

class ThreadC  extends Thread{
	public ResourceLock lock;
	public ThreadC(ResourceLock lock){
		this.lock = lock;
	}
	
	public void run(){
		try{
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    while(lock.flag!=3){
                        lock.wait();
                    }
 
                    System.out.print("!! ");
                    Thread.sleep(1000);
                    lock.flag = 1;
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception 3 :"+e.getMessage());
        }
    }
}


