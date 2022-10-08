package com.firefish.springsourcecodedeepanalysis.rmi.demo01.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.CountDownLatch;

import com.firefish.springsourcecodedeepanalysis.rmi.demo01.common.UserService;

/**
 * 功能: Server.java负责将远程对象绑定至注册中心。.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
public class Server {
	public static void main(String[] args) throws Exception {
		UserService liming = new UserServiceImpl();

		// 注册一个端口提供服务
		Registry registry = LocateRegistry.createRegistry(8888);

		// 暴露服务端的功能
		registry.bind("user",liming);

		System.out.println("registry is running...");

		System.out.println("liming is bind in registry");

		CountDownLatch latch=new CountDownLatch(1);

		latch.await();
	}

}