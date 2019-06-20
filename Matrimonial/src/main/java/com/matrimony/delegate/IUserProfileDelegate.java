package com.matrimony.delegate;

import com.matrimony.vo.UserProfileVo;

public interface IUserProfileDelegate {
	
	
	public UserProfileVo registerUser(UserProfileVo user);
	
	public UserProfileVo getUserProfile(UserProfileVo user);
	
	public UserProfileVo updateUserProfile(UserProfileVo user);
	
	public UserProfileVo deleteUserProfile(UserProfileVo user);

	
}
