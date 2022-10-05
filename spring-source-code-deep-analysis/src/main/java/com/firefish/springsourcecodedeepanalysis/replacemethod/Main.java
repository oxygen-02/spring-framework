package com.firefish.springsourcecodedeepanalysis.replacemethod;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 */
public class Main {
	public static void main(String[] args) {
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));
//		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		TestChangeMethod method = (TestChangeMethod) bf.getBean("testChangeMethod");
		method.changeMe();
	}
}
