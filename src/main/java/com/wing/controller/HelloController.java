package com.wing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(String name){
        //test the git
        return "hello" + name + "   springboot!";
    }

    public void doSomething(){
        System.out.println("doSomething");
    }

    public void sayHello(){
        //增加一个方法
        System.out.println("hello");
    }

    public void doA(){
        System.out.println("A");
    }
}
