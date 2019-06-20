package com.example.reservationSystem;

public class PassangerDetail {

	public PassangerDetail() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private byte age;
	private String sex;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PassangerDetail(String name, byte age, String sex, int id) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
	}

	
	
}
