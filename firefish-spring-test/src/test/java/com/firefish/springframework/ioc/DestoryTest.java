package com.firefish.springframework.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 *
 * @author Fire Fish
 * @since 2021-12-12 5:28 下午
 */
public class DestoryTest {

	@Test
	public void test() {

//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("destoryApplicationContext.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/applicationContext.xml");

		ctx.close();
	}
}
