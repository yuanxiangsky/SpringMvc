package com.ctmctv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Created by YuanXiang on 2017/11/29.
 */

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring(){

        System.out.println("Hello world");
        return "My Test Spring MVC";
    }

}
