package com.examples.thread;

import java.util.Date;

public class Account {
	
	private double balance = 50;
	
	public double getBalance(){
		
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  synchronized void addAmount(double amount){
		double tmp = balance;
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		synchronized(this){
		tmp += amount;
		balance = tmp;
		}
	}
	
	public synchronized void substractAmount(double amount){
		double tmp = balance;
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		tmp -= amount;
		balance = tmp;
	}

	public static void main(String[] args){
		
		Account account = new Account();
		Company company = new Company(account);
		Bank bank = new Bank(account);
		Thread cThread = new Thread(company);
		Thread bThread = new Thread(bank);
		System.out.println("Final Balance before stating: "+account.getBalance() +" | "+ new Date().getTime());
		cThread.start();
		bThread.start();
		try{
			cThread.join();
			bThread.join();
			System.out.println("Final Balance at end: "+account.getBalance()+" | "+ new Date().getTime());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void withdraw(int amount){
		balance -= amount;
	}
}


class Bank implements Runnable{
	
	private Account account;
	public Bank(Account account){
		this.account = account;
	}
	
	public void run(){
		
		for(int i=0;i<100;i++){
			account.substractAmount(1000);
		}
	}
}

class Company implements Runnable{
	
	private Account account;
	public Company(Account account){
		this.account = account;
	}
	
	public void run(){
		
		for(int i=0;i<100;i++){
			account.addAmount(1000);;
		}
	}
}