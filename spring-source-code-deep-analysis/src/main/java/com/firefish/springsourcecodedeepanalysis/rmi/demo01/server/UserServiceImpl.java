package com.firefish.springsourcecodedeepanalysis.rmi.demo01.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.firefish.springsourcecodedeepanalysis.rmi.demo01.common.UserService;

/**
 * 功能: LocalUser实现了User接口，其需要继承UnicastRemoteObject类。.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService {
	public String name;
	public int age;

	protected UserServiceImpl() throws RemoteException {
	}

	public String getName(){
		return "["+ "张三" +"]";
	}

	public void updateName(String name){
		this.name = name;
	}
}