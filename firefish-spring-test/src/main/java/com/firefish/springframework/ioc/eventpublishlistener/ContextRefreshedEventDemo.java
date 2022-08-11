package com.firefish.springframework.ioc.eventpublishlistener;

import org.springframework.context.ApplicationEvent;

/**
 * 功能：模拟事件.
 *
 * @author Fire Fish
 * @since 2021-12-12 12:22 下午
 */
public class ContextRefreshedEventDemo extends ApplicationEvent {

	private static final long serialVersionUID = 7099057723483571937L;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public ContextRefreshedEventDemo(Object source) {
		super(source);
	}

	public void print(){
		System.out.println("===事件的方法被调用===");
	}

}
