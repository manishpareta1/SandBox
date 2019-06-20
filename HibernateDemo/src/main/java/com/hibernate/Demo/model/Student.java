package com.hibernate.Demo.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="STUDENT_DETAIL")
public class Student {

	@Id
	@GeneratedValue	
	@Column(name="STUDENT_ID")
	private int stdId;
	
	@Column(name="STUDENT_NAME")
	private String sdtName;
	
	@Column(name="COLLEGE_NAME")
	private String collegeName;
	/*
	 * If we use only @ManyToMany without mappedBy parameter then Hibernate will create 2 tables for
	 * establishing the relationship between Student and Subject Entity
	 * STUDENT_DETAIL_SUBJECT_DETAIL and SUBJECT_DETAIL_STUDENT_DETAIL
	 * We can use mappedBy in any of the Entity class, so only one class will generate the Mapping table
	 * value should be same as the variable name in other Entity class
	 * we can use @JoinTable on the other referenced entity table to provide desired column name
	 * please check Subject Class studentList variable declarations
	 */
	@ManyToMany(mappedBy="studentList")
	private Collection<Subject> subjectList = new ArrayList<Subject>();
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private Collection<StudentHobby> hobbies = new ArrayList<StudentHobby>();


	public int getStdId() {
		return stdId;
	}


	public void setStdId(int stdId) {
		this.stdId = stdId;
	}


	public String getSdtName() {
		return sdtName;
	}


	public void setSdtName(String sdtName) {
		this.sdtName = sdtName;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public Collection<Subject> getSubjectList() {
		return subjectList;
	}


	public void setSubjectList(Collection<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	

	public Collection<StudentHobby> getHobbies() {
		return hobbies;
	}


	public void setHobbies(Collection<StudentHobby> hobbies) {
		this.hobbies = hobbies;
	}


	public Student(String sdtName, String collegeName) {
		super();
		
		this.sdtName = sdtName;
		this.collegeName = collegeName;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
