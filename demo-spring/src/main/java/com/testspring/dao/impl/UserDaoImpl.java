package com.testspring.dao.impl;

import com.testspring.dao.UserDao;

public class UserDaoImpl implements UserDao{
	
	public UserDaoImpl() {
		System.out.println("无参构造...");
		System.out.println(this);
	}
	
	public void init() {
		System.out.println("init...!!!");
	}
	
	public void destory() {
		System.out.println("destory...!!!");
	}
	
	public void save() {
		System.out.println("save...");
	}

}
