package com.examples.thread;

public class TrafficSignalExample {

	private static final Object object = new Object();
	public int flag;
	public String signal;



	public synchronized int getFlag() {
		return flag;
	}

	public synchronized void setFlag(int flag) {
		this.flag = flag;
	}

	public synchronized String getSignal() {
		return signal;
	}

	public synchronized void setSignal(String signal) {
		this.signal = signal;
	}

	public TrafficSignalExample(int flag, String signal) {
		super();
		this.flag = flag;
		this.signal = signal;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficSignalExample ts = new TrafficSignalExample(1, "Green");

		Road1 r1 = new Road1(object, ts);
		Road2 r2 = new Road2(object, ts);
		Road3 r3 = new Road3(object, ts);
		Road4 r4 = new Road4(object, ts);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class Road1 implements Runnable{
	public Object obj;
	public TrafficSignalExample ts;

	public Road1(Object obj, TrafficSignalExample ts) {
		super();
		this.obj = obj;
		this.ts = ts;
	}

	@Override
	public void run() {
		synchronized (obj) {
			int i=0;
			while(i<100) {

				if(ts.getFlag() ==1 && ts.getSignal().equals("Green")) {
					try {
						System.out.println("Signal is: "+ts.getSignal()+ " Vehicles Crossing from Road1.");
						ts.setSignal("Red");
						Thread.sleep(4000);
						ts.setFlag(2);
						ts.setSignal("Green");
						obj.notifyAll();	
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;

			}
		}
	}
}

class Road2 implements Runnable{
	public Object obj;
	public TrafficSignalExample ts;

	public Road2(Object obj, TrafficSignalExample ts) {
		super();
		this.obj = obj;
		this.ts = ts;
	}

	@Override
	public void run() {
		synchronized(obj) {
			int i=0;
			while(i<100) {

				if(ts.getFlag() ==2 && ts.getSignal().equals("Green")) {
					try {
						System.out.println("Signal is: "+ts.getSignal()+ " Vehicles Crossing from Road2.");
						ts.setSignal("Red");
						Thread.sleep(4000);
						ts.setFlag(3);
						ts.setSignal("Green");
						obj.notifyAll();				
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;

			}

		}
	}
}

class Road3 implements Runnable{
	public Object obj;
	public TrafficSignalExample ts;

	public Road3(Object obj, TrafficSignalExample ts) {
		super();
		this.obj = obj;
		this.ts = ts;
	}

	@Override
	public void run() {
		synchronized (obj) {
			int i=0;
			while(i<100) {

				if(ts.getFlag() ==3 && ts.getSignal().equals("Green")) {
					try {
						System.out.println("Signal is: "+ts.getSignal()+ " Vehicles Crossing from Road3.");
						ts.setSignal("Red");
						Thread.sleep(4000);
						ts.setFlag(4);
						ts.setSignal("Green");
						obj.notifyAll();	
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;

			}
		}
	}
}

class Road4 implements Runnable{
	public Object obj;
	public TrafficSignalExample ts;

	public Road4(Object obj, TrafficSignalExample ts) {
		super();
		this.obj = obj;
		this.ts = ts;
	}

	@Override
	public void run() {
		synchronized(obj) {
			int i=0;
			while(i<100) {

				if(ts.getFlag() ==4 && ts.getSignal().equals("Green")) {
					try {
						System.out.println("Signal is: "+ts.getSignal()+ " Vehicles Crossing from Road4.");
						ts.setSignal("Red");
						Thread.sleep(4000);
						ts.setFlag(1);
						ts.setSignal("Green");
						obj.notifyAll();				
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;

			}

		}
	}
}
