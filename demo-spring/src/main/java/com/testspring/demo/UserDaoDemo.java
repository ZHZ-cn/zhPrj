package com.testspring.demo;


import com.testspring.dao.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");

		// 测试属性：singleton Context容器里只有一个实例
		System.out.println("");
		System.out.println("singleton的无参构造函数的调用，也就实例化，是在Context容器被创建时，跟着一起");
		System.out.println("测试属性：singleton Context容器里只有一个实例");
		UserDao userDao1 = (UserDao) app.getBean("userDao-singleton");
		UserDao userDao2 = (UserDao) app.getBean("userDao-singleton");
		userDao1.save();
		userDao2.save();
		System.out.println(userDao1);
		System.out.println(userDao2);

		// 测试属性：测试在Context容器实例化时，执行init，销毁时调用destory
		System.out.println("");
		System.out.println("测试在Context容器实例化时，执行init，销毁时调用destory");
		System.out.println("测试属性：类似singleton Context容器里只有一个实例");
		UserDao userDao11 = (UserDao) app.getBean("userDao");
		UserDao userDao21 = (UserDao) app.getBean("userDao");
		userDao11.save();
		userDao21.save();
		System.out.println(userDao11);
		System.out.println(userDao21);
		
		// 测试属性：static-factory 
		System.out.println("");
		System.out.println("static-factory：测试在Context用factory实现实例化");
		UserDao userDao12 = (UserDao) app.getBean("userDao-static-factory");
		UserDao userDao22 = (UserDao) app.getBean("userDao-static-factory");
		userDao12.save();
		userDao22.save();
		System.out.println(userDao12);
		System.out.println(userDao22);

		// 测试属性：dynamic-factory 
		System.out.println("");
		System.out.println("dynamic-factory：测试在Context用factory实现实例化");
		UserDao userDao13 = (UserDao) app.getBean("userDao-dynamic-factory");
		UserDao userDao23 = (UserDao) app.getBean("userDao-dynamic-factory");
		userDao13.save();
		userDao23.save();
		System.out.println(userDao13);
		System.out.println(userDao23);

		// 测试属性：prototype Context容器里，每次getbean时，才会创建实例，实例有多个
		System.out.println("");
		System.out.println("测试属性：prototype Context容器里，每次getbean时，才会创建实例，实例有多个");
		UserDao userDao_prototype1 = (UserDao) app.getBean("userDao-prototype");
		UserDao userDao_prototype2 = (UserDao) app.getBean("userDao-prototype");
		userDao_prototype1.save();
		userDao_prototype2.save();
		System.out.println(userDao_prototype1);
		System.out.println(userDao_prototype2);
		
		((ClassPathXmlApplicationContext) app).close();
		
	}

}
