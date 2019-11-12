package com.zcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(path = "/test")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello this is my first springmvc project");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping" , method = {RequestMethod.POST},params = {"username=zcl"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解");
        return "success";
    }
}
