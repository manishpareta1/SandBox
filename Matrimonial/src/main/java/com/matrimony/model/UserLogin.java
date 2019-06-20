package com.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_login")
public class UserLogin {
	
	@Column(name ="user_name")
	private String userName;
	
	@Column(name ="password")
	private String password;
	
	@OneToOne
    @JoinColumn(name="user_name")
    private UserProfile userProfile;
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public UserLogin() {
		super();
	}
	
	public UserLogin(String userName, String password, UserProfile userProfile) {
		super();
		this.userName = userName;
		this.password = password;
		this.userProfile = userProfile;
	}
	
	
}
