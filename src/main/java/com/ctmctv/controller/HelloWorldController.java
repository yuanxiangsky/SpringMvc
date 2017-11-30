package com.ctmctv.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YuanXiang on 2017/11/29.
 */

@RestController
public class HelloWorldController {

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring(){

        log.info("1232123123");
        System.out.println("Hello world");
        return "My Test Spring MVC";
    }

}
