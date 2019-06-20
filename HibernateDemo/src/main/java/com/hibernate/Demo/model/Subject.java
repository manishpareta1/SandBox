package com.hibernate.Demo.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="SUBJECT_DETAIL")
public class Subject {
	
	@Id
	@GeneratedValue	
	@Column(name="SUBJECT_ID")
	private int subId;
	
	@Column(name="SUBJECT_NAME")
	private String subName;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="SUBJECT_ID"),inverseJoinColumns=@JoinColumn(name="STUDENT_ID"))
	private Collection<Student> studentList = new ArrayList<Student>();

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Collection<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Collection<Student> studentList) {
		this.studentList = studentList;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public Subject(String subName) {
		super();
		this.subName = subName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
