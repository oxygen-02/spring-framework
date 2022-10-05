package com.firefish.springsourcecodedeepanalysis.eventlistener;

import org.springframework.context.ApplicationEvent;

/**
 * 功能: 描述.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
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
