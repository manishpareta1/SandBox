package com.example.reservationSystem;

import java.util.Date;

public class TicketDetail {

	public TicketDetail() {
		// TODO Auto-generated constructor stub
	}
	
	private Train trainDetail;
	private PassangerDetail passangeDetail;
	private Double fare;
	private int pnr;
	private Date reservationCreateDate;
	private Date travelDate;
	private Station fromStation;
	private Station toStation;
	
	
	
	
	public TicketDetail(Train trainDetail, PassangerDetail passangeDetail, Double fare, int pnr,
			Date reservationCreateDate, Date travelDate, Station fromStation, Station toStation) {
		super();
		this.trainDetail = trainDetail;
		this.passangeDetail = passangeDetail;
		this.fare = fare;
		this.pnr = pnr;
		this.reservationCreateDate = reservationCreateDate;
		this.travelDate = travelDate;
		this.fromStation = fromStation;
		this.toStation = toStation;
	}
	public Station getFromStation() {
		return fromStation;
	}
	public void setFromStation(Station fromStation) {
		this.fromStation = fromStation;
	}
	public Station getToStation() {
		return toStation;
	}
	public void setToStation(Station toStation) {
		this.toStation = toStation;
	}
	public Train getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(Train trainDetail) {
		this.trainDetail = trainDetail;
	}
	public PassangerDetail getPassangeDetail() {
		return passangeDetail;
	}
	public void setPassangeDetail(PassangerDetail passangeDetail) {
		this.passangeDetail = passangeDetail;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public Date getReservationCreateDate() {
		return reservationCreateDate;
	}
	public void setReservationCreateDate(Date reservationCreateDate) {
		this.reservationCreateDate = reservationCreateDate;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	
	

}
