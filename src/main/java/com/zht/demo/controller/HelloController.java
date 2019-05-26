package com.zht.demo.controller;/*
 * @author Administrator
 *@create 2018-10-19 7:48
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello()
    {
        return "heel";
    }

}

