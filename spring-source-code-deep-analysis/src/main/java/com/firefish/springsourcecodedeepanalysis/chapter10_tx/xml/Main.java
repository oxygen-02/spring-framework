package com.firefish.springsourcecodedeepanalysis.chapter10_tx.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能: 测试类.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-09-14 10:04 PM
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/chapter10_tx/xml/application.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setName("张三");
		user.setAge(20);
		user.setSex("男");
		userService.saveWithTransaction(user);
	}
}
