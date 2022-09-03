package com.firefish.springsourcecodedeepanalysis.replacemethod;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author apple
 */
public class Main {
	public static void main(String[] args) {
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));
//		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		TestChangeMethod method = (TestChangeMethod) bf.getBean("testChangeMethod");
		method.changeMe();
	}
}
