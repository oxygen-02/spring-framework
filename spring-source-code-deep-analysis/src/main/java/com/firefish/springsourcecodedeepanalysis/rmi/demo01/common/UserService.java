package com.firefish.springsourcecodedeepanalysis.rmi.demo01.common;

import java.rmi.RemoteException;

/**
 * 功能: 客户端和服务端都需要的接口
 * 1、服务端暴露接口，以提供那些功能
 * 2、客户端知道接口.以知道有哪些功能可以调用
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
public interface UserService extends java.rmi.Remote {
    public String getName() throws RemoteException;
    public void updateName(String name) throws RemoteException;
}