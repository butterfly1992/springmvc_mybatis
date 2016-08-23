package com.demomvc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demomvc.pojo.Account;
import com.demomvc.service.UserService;

public class UserTest {

	private UserService userService;

	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml",
						"classpath:conf/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void addUser() {
		Account user = new Account();
		user.setNickname("琮02荾");
		user.setState(4);
		System.out.println(userService.insertUser(user));
	}

}
