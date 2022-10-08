package com.firefish.springsourcecodedeepanalysis.chapter11_mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能: 查看rest风格如何写数据.
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
@RestController
public class RestControllerDemo {


    @GetMapping(value = "/rest")
    protected String handler() {

        return "aaa";
    }
}
