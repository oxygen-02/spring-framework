/*
 * Copyright 2002-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context;

/**
 * Strategy interface for processing Lifecycle beans within the ApplicationContext.
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @since 3.0
 *
 * 策略接口为了处理Lifecycle beans
 *
 * 与 SmartLifecycle接口的区别是：
 *      1、SmartLifecycle接口增加了"顺序"的含义，体现在"顺序"上.
 *      2、LifecycleProcessor体现在"处理"上.
 */
public interface LifecycleProcessor extends Lifecycle {

	/**
	 * Notification of context refresh, e.g. for auto-starting components.
	 *
	 * 最后还是会调用bean的start方法，为啥要有这个接口呢，当然是为了拓展啊，为了应用SmartLifecycle接口定义的功能啊
	 */
	void onRefresh();

	/**
	 * Notification of context close phase, e.g. for auto-stopping components.
	 *
	 * onClose也会唤醒Lifecycle bean 的stop方法.
	 *
	 * 那么为什么还要这个接口呢，为了拓展啊，比如为了有顺序的关闭（SmartLifecycle）
	 */
	void onClose();

}
