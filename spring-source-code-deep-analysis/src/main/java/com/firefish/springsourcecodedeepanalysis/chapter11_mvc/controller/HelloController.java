package com.firefish.springsourcecodedeepanalysis.chapter11_mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能: 不返回ModelAndView，直接往response写数据.
 * @author Fire Fish
 * <a href="https://gitee.com/firefish985">gitee个人主页</a>
 * <a href="https://github.com/firefish985">github个人主页</a>
 * @since 2022-10-08
 */
@Controller
public class HelloController {


    @GetMapping(value = "/hello")
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.getWriter().write("helloo~~~~");
        return null;
    }
}
