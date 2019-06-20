package com.examples.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DataSourceLoader implements Runnable{

	public DataSourceLoader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSourceLoader dsloader = new DataSourceLoader();
		Thread t1 = new Thread(dsloader, "DataSourceLoader");
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread t2 = new Thread(ncLoader, "NetworkConnectionsLoader");
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.printf("Main: Configuration has been loaded %s\n", new Date());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Beginning data source loading: %s\n", new Date());
		try{
			TimeUnit.SECONDS.sleep(4);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.printf("Data Sources loading has finished %s\n", new Date());
	}

}

class NetworkConnectionsLoader implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Beginning Network Connection loading: %s\n", new Date());
		try{
			TimeUnit.SECONDS.sleep(4);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.printf("Network Connections loading has finished %s\n", new Date());
	}
	
}
