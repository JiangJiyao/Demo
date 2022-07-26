package com.joe.cn.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: Joe
 * @Date: 2022/7/22-10:15
 * @Description: com.joe.cn.controller
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        System.out.println(map);
//        int i = 1 / 0;
        return "hello controller advice";
    }
}
