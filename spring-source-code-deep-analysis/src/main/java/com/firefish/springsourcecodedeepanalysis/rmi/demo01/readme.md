# 如何通过rmi实现"远程过程调用"

## 什么是远程过程调用
RPC（Remote Processor Call）就是远程过程调用。是一个概念，既不是技术也不是框架。概念描述了一下信息：

1、客户端吧"我要调用什么类 、什么方法、什么参数"告诉服务器"

2、服务器根据要求完成调用，并把返回值返回给客户端

3、客户端就拿到了返回的数据。
上面3步完成后，就完成了远程过程调用。

关于RPC的概念可以参考马士兵老师的视频：https://www.bilibili.com/video/BV1zE41147Zq/?from=search&seid=13740626242455157002

## demo01的说明
### 客户端
```java
// 指明了我要去连那个服务器
Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8888);
```
```java
// 告诉服务端我需要这个"功能接口"
UserService user = (UserService) registry.lookup("user");
```
```java
// 告诉服务端RPC的调用信息（什么接口、什么方法、什么参数），要求服务端完成调用并返回结果
System.out.println("远程调用的结果是：" + user.getName());
```

### 服务端
```java
// 注册一个端口提供服务
Registry registry = LocateRegistry.createRegistry(8888);
```
```java
// 暴露服务端的功能
registry.bind("user",liming);
```

### UserService类
1、这个一个接口，是客户端和服务端都要有的接口。

2、客户端只有有这个接口知道服务端提供了哪些功能就可以了

3、服务端需要实现接口来提供功能