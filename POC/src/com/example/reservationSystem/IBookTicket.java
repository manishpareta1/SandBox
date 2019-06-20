package com.example.reservationSystem;

public interface IBookTicket {
	
	public TicketDetail getTicketDetail(int id);
	public TicketDetail bookTicket();
	public int cancelTicket(int id);
	public TicketDetail updateTicket(int id);
	
}
