package com.firefish.springsourcecodedeepanalysis.mybeanpostprocessor;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能: 描述.
 *
 * @author Fire Fish
 * @since 2022-09-10 6:28 PM
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/mybeanpostprocessor/application.xml");
		User user = app.getBean("user", User.class);
		System.out.println(user);
	}
}
