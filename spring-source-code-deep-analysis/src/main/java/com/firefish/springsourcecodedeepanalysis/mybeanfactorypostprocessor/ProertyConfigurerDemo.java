package com.firefish.springsourcecodedeepanalysis.mybeanfactorypostprocessor;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * 演示 自定义BeanFactory 何时被回调。
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @date 2022/09/10
 */
public class ProertyConfigurerDemo {
	public static void main(String[] args) {
		ConfigurableListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/firefish/springsourcecodedeepanalysis/mybeanfactorypostprocessor/application.xml"));
		BeanFactoryPostProcessor bfpp=(BeanFactoryPostProcessor) bf.getBean("bfpp");
		bfpp.postProcessBeanFactory(bf);
		System.out.println(bf.getBean("simpleBean"));
	}

}
