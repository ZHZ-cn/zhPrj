package com.testspring.factory;

import com.testspring.dao.UserDao;
import com.testspring.dao.impl.UserDaoImpl;

public class DynamicFactory {

	public UserDao getUserDao() {
		return new UserDaoImpl();
	}

}
