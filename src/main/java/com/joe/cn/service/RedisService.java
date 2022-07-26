package com.joe.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Joe
 * @Date: 2022/7/20-10:46
 * @Description: com.joe.cn.service
 * @Version: 1.0
 */
@Service
public class RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    public void setStr(String key, String value) {
        setStr(key, value, null);
    }

    public void setStr(String key, String value, Long time) {
        stringRedisTemplate.opsForValue().set(key, value);
        if (time != null) {
            stringRedisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
    }

    public Object getKey(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void delKey(String key) {
        stringRedisTemplate.delete(key);
    }
}
