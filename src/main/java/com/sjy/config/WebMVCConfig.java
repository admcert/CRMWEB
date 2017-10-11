package com.sjy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sunjiyun on 2017/10/10.
 */
//@EnableWebMvc
@ComponentScan(basePackages="com.sjy")
@Configuration
//@EnableWebMvc//无需使用该注解，否则会覆盖掉SpringBoot的默认配置值
public class WebMVCConfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/hello").setViewName("/hello");
//    }

}