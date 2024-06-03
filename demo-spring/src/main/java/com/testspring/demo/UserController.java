package com.testspring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testspring.service.UserService;
import com.testspring.service.impl.UserServiceImpl;

public class UserController {
	public static void main(String[] args) {
		
		System.out.println("UserController start!");

		// TODO Auto-generated method stub
		ApplicationContext app = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");

		UserService userService = (UserService) app.getBean("userService");
		
		userService.save();
		System.out.println("UserController end!");
	}
}
