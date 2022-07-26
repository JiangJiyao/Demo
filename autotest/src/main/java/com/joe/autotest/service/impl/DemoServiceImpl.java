package com.joe.autotest.service.impl;

import com.joe.autotest.service.DemoService;

/**
 * @Auther: Joe
 * @Date: 2022/7/25-16:47
 * @Description: com.joe.autotest.service.impl
 * @Version: 1.0
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "hello from service layer";
    }
}
