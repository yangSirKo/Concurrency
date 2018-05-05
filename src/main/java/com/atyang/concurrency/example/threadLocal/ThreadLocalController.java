package com.atyang.concurrency.example.threadLocal;

import com.atyang.concurrency.config.HttpInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThreadLocalController {

    private static final Logger log = LoggerFactory.getLogger(HttpInterceptor.class);

    @RequestMapping("/tl/text")
    @ResponseBody
    public String getThreadId(){

        log.info("RequestHolder.getId()= {}",RequestHolder.getId());
        return "OK";
    }


}
