package com.firefish.springframework.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firefish.springframework.aop.entity.HelloAopBean;

/**
 * 功能：
 *
 * @author Fire Fish
 * @since 2021-12-22 11:17 下午
 */
public class HelloAspectJTest {

	/**
	 * 1、找aop的入口
	 * 2、动态代理是怎么创建的
	 * 3、方法是如何别增强的（jdk，cglib）
	 */

	@Test
	public void test0() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop/aop-hello.xml");

		HelloAopBean helloAopBean = (HelloAopBean) applicationContext.getBean("helloAopBean");

//		helloAopBean.print("arg0");
		helloAopBean.print("arg0", "arg1");
//		helloAopBean.print(new String[]{"arg0"});

	}

}
