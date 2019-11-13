package com.zcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testAnno")
    public String testAnno(@RequestParam(value = "name") String username){
        System.out.println("执行了testAnno....");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testBody")
    public String testBody(@RequestBody String body){
        System.out.println("执行了testBody....");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{uid}")
    public String testPathVariable(@PathVariable(name = "uid") String id){
        System.out.println("执行了PathVariable....");
        System.out.println(id);
        return "success";
    }






}
