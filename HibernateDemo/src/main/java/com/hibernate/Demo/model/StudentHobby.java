package com.hibernate.Demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_HOBBY")
public class StudentHobby {

	@Id
	@GeneratedValue
	@Column(name="HOBBY_ID")
	private int hobbyId;
	
	@Column(name="HOBBY_NAME")
	private String hobbyName;

	public int getHobbyId() {
		return hobbyId;
	}

	public void setHobbyId(int hobbyId) {
		this.hobbyId = hobbyId;
	}

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	public StudentHobby(String hobbyName) {
		super();
		this.hobbyName = hobbyName;
	}

	public StudentHobby() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
