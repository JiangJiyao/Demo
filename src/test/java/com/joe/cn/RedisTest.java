package com.joe.cn;

import com.joe.cn.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: Joe
 * @Date: 2022/7/20-10:51
 * @Description: com.joe.cn
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {
    @Autowired
    RedisService redisService;

    @Test
    public void testRedis() {
        redisService.setStr("name", "joe");
        System.out.println("getName:==>" + redisService.getKey("name"));
    }
}
