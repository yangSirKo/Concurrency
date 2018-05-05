package com.atyang.concurrency.config;

import com.atyang.concurrency.example.threadLocal.RequestHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 实现一个过滤器
 */
public class HttpFilter implements Filter{

    private static final Logger log = LoggerFactory.getLogger(HttpFilter.class);

    @Override
    public void init(FilterConfig filterConfig){
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        log.info("do filter，{}，{}", Thread.currentThread().getId(),request.getServletPath());
        RequestHolder.setId(Thread.currentThread().getId()); // RequestHolder 中设置值
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
    }
}
