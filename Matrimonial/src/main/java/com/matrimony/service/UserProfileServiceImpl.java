package com.matrimony.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimony.dao.UserDAOImpl;
import com.matrimony.model.UserLogin;
import com.matrimony.model.UserProfile;

@Service
public class UserProfileServiceImpl implements IUserProfileService{

	@Autowired
	UserDAOImpl userDAOImpl;
	
	public UserProfile getUserProfile(String userName, String pwd) {
		// TODO Auto-generated method stub
		UserProfile  uProfile = new UserProfile();
		
		return uProfile;
	}
	
	public UserLogin addUser(UserLogin uLogin) {
		// TODO Auto-generated method stub
		UserLogin userLogin= userDAOImpl.addUser(uLogin);
		
		return userLogin;
	}

	
}
