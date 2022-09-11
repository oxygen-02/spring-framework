package com.firefish.springsourcecodedeepanalysis.chapter07;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/chapter07/application.xml");

		TestBean bean = (TestBean) context.getBean("test");
		bean.test();
		;
	}

}
