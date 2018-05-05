package com.atyang.concurrency.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Config extends WebMvcConfigurerAdapter {

    @Autowired
    HttpInterceptor httpInterceptor;

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new HttpFilter());
        frb.addUrlPatterns("/tl/*");
        return frb;
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(httpInterceptor).addPathPatterns("/**");
    }

}
