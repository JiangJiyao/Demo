package com.joe.autotest.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Joe
 * @Date: 2022/7/25-16:41
 * @Description: com.joe.autotest.rest
 * @Version: 1.0
 */
@RestController
public class InitRest {

    protected static Logger logger = LoggerFactory.getLogger(InitRest.class);

    @GetMapping("/hello")
    public String hello() {
        return "Hello，greetings from sprint-boot2-autotest";
    }
}
