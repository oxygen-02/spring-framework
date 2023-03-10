package com.firefish.springsourcecodedeepanalysis.chapter08_jdbc;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.pojo.User;
import com.firefish.springsourcecodedeepanalysis.chapter08_jdbc.service.UserService;

/**
 * 功能：
 *
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @date 2021-11-08 11:27 下午
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/firefish/springsourcecodedeepanalysis/chapter08_jdbc/application.xml");
        UserService userService = ctx.getBean(UserService.class);

        User user = new User();
        user.setName("张三");
        user.setAge(10);
        user.setSex("男");

        // 保存一条记录
        userService.save(user);


        List<User> users =  userService.getUsers();
        System.out.println("++++++++++得到所有的User");

        users.forEach(t -> {
            System.out.println(t);
        });
    }
}
