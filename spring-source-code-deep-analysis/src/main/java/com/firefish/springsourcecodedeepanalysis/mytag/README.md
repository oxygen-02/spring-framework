# spring自定义标签的使用步骤
1. 创建普通的POJO实体类，表示配置对象
2. 创建xsd约束文件
3. 创建解析类
4. 创建handler


# 原理
0. 入口：
解析xml过程中的如果是"非默认命名空间"，则执行【delegate.parseCustomElement(root);】
1. DefaultNamespaceHandlerResolver 指示了文件位置
2. 类加载器从 spring.handlers 文件加载配置，并缓存
3. 根据"名称空间"找到handler
4. 回调handler的init方法【】
5. --------
6. 找到元素的"元素解析器"
7. 回调解析器的parse方法【有多次回调的路线: parse ---> parseInternal ---> doParse】。 所以一般也建议直接继承 AbstractSingleBeanDefinitionParser

