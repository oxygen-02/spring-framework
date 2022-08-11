package com.firefish.springframework.ioc.eventpublishlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 功能：模拟的listener.
 *
 * @author Fire Fish
 * @since 2021-12-12 12:21 下午
 *
 * 1、一开始只支持监听特定事件
 * 2、发展为支持监听"泛型"事件
 * 3、后来因为泛型只能监听一种事件，发展为SmartApplicationListener、GenericApplicationListener支持多种事件。
 * 			那么这2种监听器的区别是什么
 */
@Component
public class ContextRefreshListenerDemo implements ApplicationListener<ContextRefreshedEventDemo> {

	@Override
	public void onApplicationEvent(ContextRefreshedEventDemo event) {
		// 调用事件方法
		event.print();
	}
}
