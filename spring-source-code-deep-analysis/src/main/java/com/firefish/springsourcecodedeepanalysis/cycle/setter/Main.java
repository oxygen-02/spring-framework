package com.firefish.springsourcecodedeepanalysis.cycle.setter;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("com/firefish/springsourcecodedeepanalysis/cycle/setter/application.xml"));
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//                "com/firefish/springsourcecodedeepanalysis/cycle/setter/application-version02.xml");
		System.out.println(context.getBean("bean_3"));
	}
}
