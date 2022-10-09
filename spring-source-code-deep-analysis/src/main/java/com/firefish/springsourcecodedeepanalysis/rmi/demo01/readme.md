**# 如何通过rmi实现"远程过程调用"

@[TOC](文章结构)
欢迎微信搜索公众号“火鱼Java杂谈”，分享了硬核Spring源码

## 什么是远程过程调用
RPC（Remote Processor Call）就是远程过程调用。是一个概念，既不是技术也不是框架。概念描述了一下信息：

1、客户端吧"我要调用什么类 、什么方法、什么参数"告诉服务器"

2、服务器根据要求完成调用，并把返回值返回给客户端

3、客户端就拿到了返回的数据。

上面3步完成后，就完成了远程过程调用。 关于RPC的概念可以参考马士兵老师的视频：https://www.bilibili.com/video/BV1zE41147Zq/?from=search&seid=13740626242455157002

## RMI调用示例

### 公共接口
1、这个一个接口，是客户端和服务端都要有的接口。

2、客户端只有有这个接口知道服务端提供了哪些功能就可以了

3、服务端需要实现接口来提供功能

`UserService.java`
```java
public interface UserService extends java.rmi.Remote {
	public String getName() throws RemoteException;
	public void updateName(String name) throws RemoteException;
}
```
### 客户端
`Client.java`
```java
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
```

### 服务端
`Server.java`
```java
public class Server {
	public static void main(String[] args) throws Exception {
		UserService liming = new UserServiceImpl();

		// 注册一个端口提供服务
		Registry registry = LocateRegistry.createRegistry(8888);

		// 暴露服务端的功能
		registry.bind("user",liming);

		System.out.println("registry is running...");

		System.out.println("liming is bind in registry");
	}
}
```
`UserServiceImpl.java`
```java
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
```

### 调用过程图
![img.png](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/Snip20221008_1.png)
图片来源：https://zhuanlan.zhihu.com/p/157481904

上图是我修改后画的，也可以看看先知中这个师傅里边用的流程图

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/v2-6feada738b25de640a50643e20292152_r.jpg)
图片来源：https://xz.aliyun.com/t/2223**