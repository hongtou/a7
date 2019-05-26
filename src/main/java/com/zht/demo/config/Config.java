package com.zht.demo.config;/*
 * @author Administrator
 *@create 2018-10-19 7:53
 */

import com.zht.demo.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
     public ServletRegistrationBean myserver()
     {
         ServletRegistrationBean servletRegistrationBean= new ServletRegistrationBean(new MyServlet(),"/hhh");
         return servletRegistrationBean;
     }
}
