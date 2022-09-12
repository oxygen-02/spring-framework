package com.firefish.springsourcecodedeepanalysis.chapter07;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * aop测试
 *
 * 原理分析的入口：那肯定是【aspectj-autoproxy】
 * 第一步：注册aop特殊的bena
 * 第二步：查找候选的增强器
 * 第三步：适配适应当前bean的增强器
 * 第四步：根据增强器创建代理对象
 * 第五步：代理对象对目标方法进行拦截
 *
 * @author apple
 * @date 2022/09/11
 */
public class AopTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/chapter07/application.xml");

		TestBean bean = (TestBean) context.getBean("test");
		bean.test();
	}
}
