package com.examples.thread;



public class PrintHelloThenWorld {

	Object hello = new Object();
    Object world = new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<100; i++){
			
			Runnable helloTask = new Runnable(){
                @Override
                public void run(){
                    new PrintHelloThenWorld().printHello();
                }
            };

            Runnable worldTask = new Runnable(){
                @Override
                public void run(){
                    new PrintHelloThenWorld().printWorld();
                }
            };
            Runnable gone = new Runnable(){
                @Override
                public void run(){
                    new PrintHelloThenWorld().printGone();
                }
            };

            Thread t1 = new Thread(helloTask);
            Thread t2 = new Thread(worldTask);
            Thread t3 = new Thread(gone);
            
            try {
            	t1.start();
                t2.start();
                //t3.start();
                t1.join();
				t2.join();
				//t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
			}
	
		public void printHello(){
				System.out.println("Hello");
			
		}
		public void printWorld(){
				System.out.println("world");
			
		}
		public void printGone(){
			System.out.println("Gone");
			
	}
	}


