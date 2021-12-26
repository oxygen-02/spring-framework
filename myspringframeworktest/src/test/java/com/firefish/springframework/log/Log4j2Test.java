package com.firefish.springframework.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 功能：
 * 1、使用commons.logging，结合log4j2 的测试类
 * 2、配置文件放在test/resource/log4j2-test.xml（必须要叫这个名字否则会加载到别的模块的日志配置）
 * @author apple
 * @date 2021-12-26 9:59 上午
 */
public class Log4j2Test {


	public static final Log logger = LogFactory.getLog(Log4j2Test.class);

	public static void main(String[] args) {
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}
}
