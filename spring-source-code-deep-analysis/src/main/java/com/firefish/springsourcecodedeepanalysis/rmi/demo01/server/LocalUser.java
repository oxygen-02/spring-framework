package com.firefish.springsourcecodedeepanalysis.rmi.demo01.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.firefish.springsourcecodedeepanalysis.rmi.demo01.common.User;

/**
 * 功能: LocalUser实现了User接口，其需要继承UnicastRemoteObject类。.
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
public class LocalUser extends UnicastRemoteObject implements User {
	public String name;
	public int age;

	public LocalUser(String name, int age) throws RemoteException {
		super();
		this.name = name;
		this.age = age;
	}

	public User getUser(){
		return this;
	}

	public String getName(){
		return "["+this.name+"]";
	}

	public void updateName(String name){
		this.name = name;
	}
}