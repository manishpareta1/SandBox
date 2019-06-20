package com.examples.thread;

public class AccountManager implements Runnable{

	private Account acc = new Account();
	boolean overdrawan = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManager am = new AccountManager();

		Thread t1 = new Thread(am,"Manish");
		Thread t2 = new Thread(am,"Piyush");
		//t1.setPriority(10);
		t1.start();
		t2.start();


	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			makeWithdrawal(10);
			if(acc.getBalance()<0){
				System.out.println("Account is Overdrawan!!");
				overdrawan = true;
			}
			if(overdrawan)
				break;

		}
	}

	private synchronized void makeWithdrawal(int withdraw){

		if(acc.getBalance()>=withdraw){
			System.out.println(Thread.currentThread().getName()+ " is going to Withdraw");

			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			{
				acc.withdraw(withdraw);
				System.out.println(Thread.currentThread().getName() + " Completels Withdrawal, " + "Balance is: "+acc.getBalance());
			}
			
		}else{
			System.out.println("Not enough money in account " + Thread.currentThread().getName() + " to withdraw " + acc.getBalance());
		}
	}

}
