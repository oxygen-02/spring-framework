package com.firefish.springframework.ioc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firefish.springframework.ioc.eventpublishlistener.ContextRefreshedEventDemo;

/**
 * 功能：
 *
 * @author Fire Fish
 * @since 2021-12-12 12:23 下午
 *
 *
 */
public class EventPublishTest {


	ClassPathXmlApplicationContext ctx;

	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("ioc/applicationContext.xml");
	}

	@Test
	public void publish(){
		ctx.publishEvent(new ContextRefreshedEventDemo(this));
	}
}
