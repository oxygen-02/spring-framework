package com.firefish.springsourcecodedeepanalysis.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/aware/application.xml");
		TestAware testAware = (TestAware) context.getBean("testAware");
		testAware.testAware();
	}
}
