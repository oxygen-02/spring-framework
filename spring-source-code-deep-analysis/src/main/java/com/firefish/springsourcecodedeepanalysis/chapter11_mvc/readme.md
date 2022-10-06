## demo项目说明

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
2、编写服务器配置文件，即`web.xml`文件

3、编写前端控制器上下文，即`dispatcherServlet-servlet.xml`文件

4、编写应用上下文，即`applicationContext.xml`

5、编写业务类

6、跑引用
* 用tomcat插件方式
* 用本地的tomcat容器方式（推荐）

7、启动好服务器后浏览器访问
`http://localhost:8080/userList.htm`

### 原理
1、ContextLoaderListener类

本质就是启动一个spring容器
* 该类实现了servlet规范的ServletContextListener接口，在servlet服务器启动后会回调接口的contextInitialized方法；
* 在该方法中，<mark>会启动"根web应用上下文"容器</mark>，会加载spring的核心配置文件（可以包括或不包括mvc的配置，即上文的`applicationContext.xml`）； 
* 从官方定义的名称`ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE`来看，我们姑且称之为`根web应用上下文/根应用容器`，英文名称为`rootContext`


2、DispatcherServlet类

本质也是启动一个spring容器
* 是一个servlet，服务器在初始化servlet时会回调init方法；
* 在该方法中，<mark>会启动"servlet上下文"容器</mark>，会加载servlet配置文件（mvc相关的，即上文的`dispatcherServlet-servlet.xml`），会完成mvc相关组件的加载。
* 从官方定义的名称`SERVLET_CONTEXT_PREFIX`来看，我们姑且称之为`servlet上下文/servlet容器`，英文名称为`servletContext`。

注：2个容器rootContext 和 servletContext 一般都会存在，但是2个配置文件


3、请求的链路：
* servlet容器
  * servlet-mapping映射
    * DispatcherServlet
      * 各个Controller
        * View