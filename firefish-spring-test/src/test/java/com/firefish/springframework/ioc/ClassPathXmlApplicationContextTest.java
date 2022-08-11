package com.firefish.springframework.ioc;

import com.firefish.springframework.ioc.entity.Hello;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 *
 * @author Fire Fish
 * @since 2021-11-20 10:48 上午
 */
public class ClassPathXmlApplicationContextTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/applicationContext.xml");

		Hello bean = ctx.getBean(Hello.class);

		System.out.println(bean);

		ctx.close();
	}
}
