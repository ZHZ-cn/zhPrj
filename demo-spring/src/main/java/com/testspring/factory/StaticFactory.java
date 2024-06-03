package com.testspring.factory;

import com.testspring.dao.UserDao;
import com.testspring.dao.impl.UserDaoImpl;

public class StaticFactory {

	public static UserDao getUserDao() {
		return new UserDaoImpl();
	}
}
