package com.firefish.springsourcecodedeepanalysis.chapter11_mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能：
 *
 * @author apple
 * @date 2021-11-20 12:31 下午
 */
@Controller
public class HelloController {


    @GetMapping("/hello")
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.getWriter().write("helloo~~~~");
        return null;
    }
}
