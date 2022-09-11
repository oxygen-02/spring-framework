package com.firefish.springsourcecodedeepanalysis.eventlistener;

import org.springframework.context.ApplicationEvent;

/**
 * 功能: 描述.
 *
 * @author Fire Fish
 * @since 2022-09-11 5:03 PM
 */
public class TestEvent extends ApplicationEvent {



	public String msg;

	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}


	public void print(){
		System.out.println(msg);
	}
}
