package com.examples;

public abstract class Airline {
	public void checkIn(String guestName){
		System.out.println(guestName+" Checked in!!");;
	}
	public void checkOut(String guestName){
		System.out.println(guestName+" Checked Out!!");;
	}
	public void listOfTodaysFlight(){
		
	}
	public abstract void bookTicket();
	public abstract void saveSGestInformation();
	public abstract void getFlightDetail();
}
