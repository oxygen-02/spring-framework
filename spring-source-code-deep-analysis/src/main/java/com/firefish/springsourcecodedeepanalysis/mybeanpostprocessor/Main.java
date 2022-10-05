package com.firefish.springsourcecodedeepanalysis.mybeanpostprocessor;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能: 描述.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-09-10 6:28 PM
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/mybeanpostprocessor/application.xml");
		User user = app.getBean("user", User.class);
		System.out.println(user);
	}
}
