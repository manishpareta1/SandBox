package com.matrimony.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.matrimony.model.UserLogin;
import com.matrimony.model.UserProfile;
import com.matrimony.service.UserProfileServiceImpl;
import com.matrimony.vo.UserProfileVo;

@Component("userProfileDelegateImpl")
public class UserProfileDelegateImpl implements IUserProfileDelegate{
	
	@Autowired
	UserProfileServiceImpl userProfileServiceImpl;
	
	public UserProfileVo registerUser(UserProfileVo user) {
		
		UserProfile uProfile =  new UserProfile(user.getId(), user.getFirstName(), user.getLastName(), 
				user.getEmail(), user.getPhone(), user.getUserName(),"N");
		
		UserLogin uLogin = new UserLogin(user.getUserName(), user.getPassword(), uProfile);
		
		UserLogin userLogin  = userProfileServiceImpl.addUser(uLogin);
		
		UserProfileVo uProfileVo = new UserProfileVo(userLogin.getUserProfile().getId(), 
				userLogin.getUserProfile().getFirstName(), userLogin.getUserProfile().getLastName(), 
				userLogin.getUserProfile().getEmail(), userLogin.getUserProfile().getPhone(), 
				userLogin.getUserName(), userLogin.getUserProfile().isAdminRole());
		
		return uProfileVo;
	}
	

	public UserProfileVo getUserProfile(UserProfileVo user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserProfileVo updateUserProfile(UserProfileVo user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserProfileVo deleteUserProfile(UserProfileVo user) {
		// TODO Auto-generated method stub
		return null;
	}

}
