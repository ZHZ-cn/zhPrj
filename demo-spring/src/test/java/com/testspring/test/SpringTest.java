package com.testspring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testspring.dao.UserDao;

public class SpringTest {
	
	@Test
	
	public void test1() {
		// TODO Auto-generated method stub
		ApplicationContext app = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");

		// 测试属性：singleton Context容器里只有一个实例
		System.out.println("singleton的无参构造函数的调用，也就实例化，是在Context容器被创建时，跟着一起");
		System.out.println("测试属性：singleton Context容器里只有一个实例");
		UserDao userDao1 = (UserDao) app.getBean("userDao-singleton");
		UserDao userDao2 = (UserDao) app.getBean("userDao-singleton");
		userDao1.save();
		userDao2.save();
		System.out.println(userDao1);
		System.out.println(userDao2);
		
	}

}
