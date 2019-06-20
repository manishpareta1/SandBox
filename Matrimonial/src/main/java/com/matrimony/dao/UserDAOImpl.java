package com.matrimony.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.matrimony.model.UserLogin;

@Repository("userDAOImpl")
public class UserDAOImpl implements UserDAO{

	@Autowired  
	SessionFactory sessionFactory;

	public UserLogin getUserProfile(String userName) {
		// TODO Auto-generated method stub
		UserLogin uProfile= new UserLogin();
		Session session = sessionFactory.openSession();  
		uProfile  = (UserLogin) session.load(UserLogin.class, userName);  
		return uProfile;
	}
	
	public UserLogin addUser(UserLogin userLogin){
		// TODO Auto-generated method stub
		UserLogin uLogin = new UserLogin();
		Session session = sessionFactory.openSession();  
		uLogin  = (UserLogin) session.save(userLogin);  
		return uLogin;
	}

}
