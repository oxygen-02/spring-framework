package com.firefish.springframework.ioc.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 功能：演示Aware方法的作用时机（注册和调用时机）.
 *
 * @author Fire Fish
 * @since 2021-12-12 11:44 上午
 */
@Component
public class EnvironmentAwareDemo implements EnvironmentAware {

	Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
}
