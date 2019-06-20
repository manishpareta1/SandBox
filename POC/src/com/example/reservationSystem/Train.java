package com.example.reservationSystem;

import java.util.Map;

public class Train {
	
	private int Id;
	private String name;
	private Map<Station, Double> stationWithFair;
	private int totalDistance;
	private int availableSeates;
	
	
	public int getAvailableSeates() {
		return availableSeates;
	}
	public void setAvailableSeates(int availableSeates) {
		this.availableSeates = availableSeates;
	}
	//	private String trainType;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Station, Double> getStationWithFair() {
		return stationWithFair;
	}
	public void setStationWithFair(Map<Station, Double> stationWithFair) {
		this.stationWithFair = stationWithFair;
	}
	public int getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}
	public Train(int id, String name, Map<Station, Double> stationWithFair, int totalDistance, int availableSeates) {
		super();
		Id = id;
		this.name = name;
		this.stationWithFair = stationWithFair;
		this.totalDistance = totalDistance;
		this.availableSeates = availableSeates;
	}
	
	
	
	

}
