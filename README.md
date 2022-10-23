
## Spring源码编译

如何省时省力完成Spring源码编译，How do，怎么做。请继续...，编译过程遇到困难可与<a href="https://gitee.com/firefish985/spring-framework-deepanalysis/tree/5.1.x#%E5%BD%A9%E8%9B%8B">作者联系</a>。

Spring的源码编译对于接触Spring不久的开发者可能是个小的挑战，妨碍了我们学习Spring特征的兴趣。而当下的目标是学习Spring而不是拘泥于环境配置，能不能跳过这一步直接学习呢？等学习到一定程度了自然就会了源码的编译。基于这个原因我在gitee上创建了一个简单、开箱即用的spring源码项目，直接当做普通的项目下载导入IDEA就可以运行。

### 项目介绍

<mark>项目地址</mark>：https://gitee.com/firefish985/spring-framework-deepanalysis

<mark>项目介绍</mark>：spring-framework-deepanalysis 是从spring官方的spring framework中clone来的项目，初衷是用于了解spring特征之用，后来经过一段时间给源码补充了很多注释也基于目前一些开发者不重视源码的学习，遂将项目开源出来供交流学习。该项目由如下鲜明特点：

**1、可以直接导入idea跑的官方项目**

**2、从 spring framework 官方clone的，只做增加不做修改**

**3、添加了多个自定义源码特征学习模块，如 spring-source-code-deep-analysis**

### 前置条件

- 安装了jdk环境


可以通过java -version来检测，如果没有安装请自行安装

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-01-12-image.png)

- 安装了git环境


![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-19-53-image.png)

- 安装了IDEA开发工具

- 安装gradle（可选）


Spring源码时基于gradle编译的，不同于我们常见项目用的maven。因为源码中配置了gradle-wrapper，在项目导入IDEA的时候回去下载，所以目前暂时可以不用安装

### 编译源码

#### 下载源码zip包或者clone项目

```shell
git clone https://gitee.com/firefish985/spring-framework-deepanalysis.git
```

#### 切换到源码的5.1x分支

这里主要研究的是Spring5，作者的所有注释都是在5.1分支

如果需要学习别的分支请对应切换

```shell
# 进入项目目录（具体就是你clone的目录）
cd /Users/apple/Documents/Work/Development/github/spring-framework-personal
# 查看远程所有的分支
git branch -a
# 查看当前所在的分支
git branch --list
# 切换到5.1的目标分支
git checkout 5.1.x
```

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-50-19-image.png)

#### 用idea导入项目

导入过程中会去阿里云下载非常多依赖的jar包、gradle安装等文件，耗费时间很多，请泡一杯咖啡、打开中国好声音、打开网易云音乐听听歌。

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-33-30-image.png)

导入结束后如果控制台没有报错，gradle窗口能显示项目，那么恭喜你，畅途无阻一切顺利。如下图：

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-38-54-image.png)![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-39-36-image.png)

如果出现了错误，也不要担心，相比从官方编译和按我这种方式编译，我这是最小成本，您可以自行解决一下或在gitee该项目下评论与我联系。

#### 验证导入的项目

作者新建了一个自定义的模块：spring-source-code-deep-analysis，用来测试和debug官方的项目。如您可以选择<mark>BeanFactoryTest</mark>运行一个测试

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-52-43-image.png)

不出意外会得到下面的运行成功的图

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-09-55-38-image.png)

至此完成了全部的项目编译，请畅游Spring源码特征

#### 致谢

源码注释 或 gitee提交记录或许对你有些用处

- 作者在该项目源码，写了<mark>大量的详细注释且在持续更新，几乎覆盖了Spring常用的功能。</mark>

- 在gitee提交记录中，对Spring的核心功能进行了<mark>分门别类</mark>的提交

- 各位觉得如果对你有所帮助，请不要吝啬你的鼓励，给作者一个star

- 欢迎各位开发道友提issue、交流


#### 彩蛋

如果你也想添加自己的模块，可以参考我添加spring-source-code-deep-analysis模块同样的方式。我的添加方式我放在了gitee的提交记录中，如下：

![](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-09-10-10-06-31-image.png)

如果你想使用spring官方的源码编译，参考：https://blog.csdn.net/Dcwjh/article/details/104471560

### 联系作者

如有Spring5源码编译问题或技术交流可与作者联系：

![个人二维码](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/2022-10-16-22-57-54-image.png)
![微信公众号](https://firefish-dev-images.oss-cn-hangzhou.aliyuncs.com/dev-images/1665933617793.jpg)