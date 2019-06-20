package com.examples.thread;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileSearch implements Runnable{

	private String initPath;
	private String fileName;
	
	
	public FileSearch(String initPath, String fileName) {
		// TODO Auto-generated constructor stub
		this.initPath = initPath;
		this.fileName = fileName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch fs = new FileSearch("C:\\Users\\manish.pareta\\Downloads\\eclipse", "bundle.properties");
		Thread t = new Thread(fs);
		t.start();
		
		try{
			TimeUnit.SECONDS.sleep(0);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		t.interrupt();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File f = new File(initPath);
		if(f.isDirectory()){
			try{
				directoryProcess(f);
			}catch(InterruptedException e){
				e.printStackTrace();
				System.out.printf("%s: The search has been interrupted", Thread.currentThread().getName());
			}
		}
	}
	
	public void directoryProcess(File f) throws InterruptedException{
		File list[] = f.listFiles();
		if(list != null){
			for(int i=0;i<list.length;i++){
				if(list[i].isDirectory()){
					directoryProcess(list[i]);
				}else{
					fileProcess(list[i]);
				}
				}
			}
		if(Thread.interrupted()){
			throw new InterruptedException();
		}
	}
	
	public void fileProcess(File f) throws InterruptedException{
		if(f.getName().equals(fileName)){
			System.out.printf("%s: %s\n",Thread.currentThread().getName(), f.getAbsolutePath() );
		}if(Thread.interrupted()){
			throw new InterruptedException();
		}
	}
}
