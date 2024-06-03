package com.testspring.service.impl;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testspring.dao.UserDao;
import com.testspring.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserServiceImpl() {
		
	}
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public void save() {
		userDao.save();
		System.out.println(userDao);
	}

//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
}
