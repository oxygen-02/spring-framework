package com.firefish.springsourcecodedeepanalysis.eventlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 功能: 描述.
 *
 * @author Fire Fish
 * @since 2022-09-11 5:05 PM
 */
public class TestListener  implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TestEvent){
			TestEvent testEvent = (TestEvent) event;
			// 发生事件时， 调用事件的方法
			testEvent.print();
		}
	}
}
