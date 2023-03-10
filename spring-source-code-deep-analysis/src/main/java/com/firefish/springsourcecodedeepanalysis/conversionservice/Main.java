package com.firefish.springsourcecodedeepanalysis.conversionservice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 完成测功能跟"属性编辑器"类似
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-09-11 5:32 PM
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app =
				new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/conversionservice/application.xml");
		User user = (User) app.getBean("user");
		System.out.println(user);
	}
}
