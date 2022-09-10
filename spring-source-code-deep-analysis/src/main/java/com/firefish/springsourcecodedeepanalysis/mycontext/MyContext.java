package com.firefish.springsourcecodedeepanalysis.mycontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过继承拓展核心容器
 * 1、要求必须设置username属性
 */
public class MyContext extends ClassPathXmlApplicationContext {

	public MyContext(String... locations) {
		super(locations);
	}

	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("username");
	}
}
