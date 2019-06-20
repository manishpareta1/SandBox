package com.hibernate.Demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * Note: Class annotated with @Embeddedble need not to be mentioned as mapping property in hibernate config file
 * Only Class annotated with @Entity is required to be mentioned. 

 * Note: All class which uses auto generated sequence for defining primary key must have a default
 * constructor created else hibernate will error out while generating the seq no
 * ERROR:
 * Hibernate: select next_val as id_val from hibernate_sequence for update
 * Hibernate: update hibernate_sequence set next_val= ? where next_val=?
 * Exception in thread "main" org.hibernate.InstantiationException: No default constructor for entity:  : com.hibernate.Demo.model.UserEmployeer
 */
@Embeddable
public class UserEmployeer {
	
	@Column(name="EMPLOYEER_NAME")
	private String employerName;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	
	@Column(name="LAST_WORKING_DATE")
	private Date lastWorkingDay;

	public UserEmployeer(String employerName, String designation, Date joiningDate, Date lastWorkingDay) {
		super();
		this.employerName = employerName;
		this.designation = designation;
		this.joiningDate = joiningDate;
		this.lastWorkingDay = lastWorkingDay;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLastWorkingDay() {
		return lastWorkingDay;
	}

	public void setLastWorkingDay(Date lastWorkingDay) {
		this.lastWorkingDay = lastWorkingDay;
	}

	public UserEmployeer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserEmployeer [employerName=" + employerName + ", designation=" + designation + ", joiningDate="
				+ joiningDate + ", lastWorkingDay=" + lastWorkingDay + "]";
	}
	
	

}
