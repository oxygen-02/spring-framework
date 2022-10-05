package com.firefish.springsourcecodedeepanalysis.eventlistener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能: Spring的事件、监听机制.
 *
 * 步骤：
 * 1、发布事件【app.publishEvent(event);】
 * 2、被监听器见听到
 * 3、调用事件的处理方法
 *
 * 关于原理的几个问题：
 * 1、作用机制是什么：发布 ---> 监听到 ---> 调用事件的处理方法
 * 2、在哪里注册的监听器
 * 3、监听器是的"存储结构"？
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-09-11 5:07 PM
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext app =
				new ClassPathXmlApplicationContext("com/firefish/springsourcecodedeepanalysis/eventlistener/application.xml");
		TestEvent event = new TestEvent("hello", "msg");

		// 发布事件
		app.publishEvent(event);
	}
}
