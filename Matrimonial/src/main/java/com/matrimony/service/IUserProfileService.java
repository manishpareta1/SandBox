package com.matrimony.service;

import com.matrimony.model.UserProfile;

public interface IUserProfileService {
	
	public UserProfile getUserProfile(String userName, String pwd);
	

}
