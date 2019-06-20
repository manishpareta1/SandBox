package com.examples.thread;

public class Cinema {
	
	private long vacanciesCinema1;
	private long vacanciesCinema2;
	
	private final Object controlCinema1, controlCinema2;
	
	public Cinema(){
		controlCinema1 = new Object();
		controlCinema2 = new Object();
		vacanciesCinema1 = 20;
		vacanciesCinema2 = 20;
	}
	
	public boolean sellTicket1(int number){
		synchronized(controlCinema1){
			if(number<vacanciesCinema1){
				vacanciesCinema1 -= number;
				return true;
			}else{
				return false;
			}
		}
	}
	
	public boolean sellTicket2(int number){
		synchronized(controlCinema2){
			if(number<vacanciesCinema2){
				vacanciesCinema2 -= number;
				return true;
			}else{
				return false;
			}
		}
	}
	
	public boolean returnTicket1(int number){
		synchronized(controlCinema1){
				vacanciesCinema1 += number;
				return true;
		}
	}
	public boolean returnTicket2(int number){
		synchronized(controlCinema2){
				vacanciesCinema2 += number;
				return true;
		}
	}
	
	public long getVacanciesCinema1(){
		return vacanciesCinema1;
	}
	
	public long getVacanciesCinema2(){
		return vacanciesCinema2;
	}
	
	
	public static void main(String[] args){
		Cinema cinema = new Cinema();
		
		TicketOfficel t1 = new TicketOfficel(cinema);
		TicketOffice2 t2 = new TicketOffice2(cinema);
		
		Thread tt1 = new Thread(t1,"TicketOfficel1");
		Thread tt2 = new Thread(t2, "TicketOfficel2");
		
		tt1.start();
		tt2.start();
		
		try{
			tt1.join();
			tt2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Room 1 Vacency : " +cinema.getVacanciesCinema1());
		System.out.println("Room 2 Vacency : " +cinema.getVacanciesCinema2());
	}
	
}

class TicketOfficel implements Runnable{
	
	private Cinema cinema;
	public TicketOfficel(Cinema cinema){
		this.cinema = cinema;
	}
	
	public void run(){
		cinema.sellTicket1(3);
		cinema.sellTicket2(4);
		cinema.sellTicket1(1);
		cinema.returnTicket1(2);
		cinema.sellTicket1(4);
		cinema.sellTicket2(1);
		cinema.sellTicket2(1);
		cinema.sellTicket2(2);
		cinema.returnTicket2(5);
		cinema.sellTicket1(3);
		cinema.sellTicket2(1);
		
	}
}


class TicketOffice2 implements Runnable{
	
	private Cinema cinema;
	public TicketOffice2(Cinema cinema){
		this.cinema = cinema;
	}
	
	public void run(){
		cinema.sellTicket1(3);
		cinema.sellTicket2(4);
		cinema.sellTicket1(1);
		cinema.sellTicket1(4);
		cinema.returnTicket2(5);
		cinema.sellTicket2(1);
		cinema.sellTicket2(1);
		cinema.sellTicket2(2);
		cinema.sellTicket1(3);
		cinema.sellTicket2(1);
		cinema.returnTicket1(3);
		
	}
}
