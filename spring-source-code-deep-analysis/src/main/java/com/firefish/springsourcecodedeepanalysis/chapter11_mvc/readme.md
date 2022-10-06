## 测试项目介绍

### 跑项目
你只需要下载tomcat服务器，并在idea中配置好tomcat服务器， 即可直接运行spring-source-code-deep-analysis.gradle项目。
注意：只有模块chapter11_mvc是mvc模块，其他包模块并不是

### 开发的步骤
下面这些步骤我已经全部写好了，在项目中去找就可以了，从web.xml文件找。

1、引入jar包等
```xml
// servlet规范和jsp
providedCompile "javax.servlet:javax.servlet-api:4.0.1"
providedCompile 'javax.servlet.jsp:javax.servlet.jsp-api:2.3.2-b02'

// 引入jstl标签库
implementation "org.apache.taglibs:taglibs-standard-jstlel:1.2.5"
implementation "org.apache.taglibs:taglibs-standard-jstlel:1.2.5"
```
2、编写服务器配置文件，即web.xml文件

3、编写前端控制器上下文，即dispatcherServlet-servlet.xml文件

4、编写应用上下文，即applicationContext.xml

5、编写业务类

6、跑引用
* 用tomcat插件方式
* 用本地的tomcat容器方式（推荐）

7、启动好服务器后浏览器访问
`http://localhost:8080/userList.htm`

### 原理
1、ServletContextListener接口实现了servlet规范，负责吧spring的web容器启动起来，几乎全部的功能都是这个容器负责的。可称为父容器。
2、DispatcherServlet是一个servlet，负责吧spring的分发容器启动起来，负责请求的分发，可以理解为作用在contrller层。可称为子容器。
注：并不一定父子容器都会存在，存在父子容器不过是为了应用解耦，比如分发可以不用springmvc而用struct来代替，但是应用的核心功能还是有spring core来完成
3、请求的链路：
servlet容器---> servlet-mapping映射 ---> DispatcherServlet ---> 各个Controller ---> View