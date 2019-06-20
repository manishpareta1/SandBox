package com.examples.collections.iterators;

public class Students {
	
	private int id;
	private String name;
	private String course;
	
	
	public Students(int id, String name, String course){
		
		this.id		=id;
		this.name 	= name;
		this.course = course;
	}
	
	public String toString(){
		
		return " Name: " + this.name + "\n Id: " + this.id + "\n Course: " + this.course;
	}

}
