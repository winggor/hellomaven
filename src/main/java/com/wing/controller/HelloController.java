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
    

    public void doB(){
        int a  = 1;
        System.out.println(a);
    }


    public void doC(){
        System.out.println("ccc");
    }




    public void doD(){
        int a = 6;
        System.out.println(a);
    }
    public void doF(){
        int a = 666;
        System.out.println(a);
    }

     public void doE(){
        int a = 7;
        System.out.println(a);
    }
}
