package com.firefish.springsourcecodedeepanalysis.rmi.demo01.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.firefish.springsourcecodedeepanalysis.rmi.demo01.common.User;

/**
 * 功能:
 * 1、Client用来调用远程方法，由于需要调用具体方法，所以本地需要有服务端注册的远程对象类所实现的接口。.
 * 2、Client与注册中心和服务端交互。
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
public class Client {

	public static void main(String[] args) throws Exception {

		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8888);
		User user = (User) registry.lookup("user");
		System.out.println("远程调用的结果是：" + user.getName());
	}
}
