package com.firefish.springsourcecodedeepanalysis.rmi.demo01.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.firefish.springsourcecodedeepanalysis.rmi.demo01.common.UserService;

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

		// 指明了我要去连那个服务器
		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8888);

		// 告诉服务端我需要这个"功能接口"
		UserService user = (UserService) registry.lookup("user");

		// 告诉服务端RPC的调用信息（什么接口、什么方法、什么参数），要求服务端完成调用并返回结果
		System.out.println("远程调用的结果是：" + user.getName());
	}
}
