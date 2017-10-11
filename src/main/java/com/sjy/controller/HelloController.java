package com.sjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjiyun on 2017/10/10.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
