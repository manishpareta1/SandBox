package com.matrimony.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.matrimony.delegate.UserProfileDelegateImpl;
import com.matrimony.vo.UserProfileVo;



public class MatrimonyController {

	@Autowired
	UserProfileDelegateImpl userProfileDelegateImpl;
	
	@RequestMapping("register")  
	public ModelAndView registerUser(@ModelAttribute UserProfileVo user) {  
		userProfileDelegateImpl.registerUser(user);  
		return new ModelAndView("myprofile", "userProfile", user);  
	}  
}
