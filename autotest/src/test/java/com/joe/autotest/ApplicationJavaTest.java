package com.joe.autotest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: Joe
 * @Date: 2022/7/25-16:51
 * @Description: 普通Java测试，比如配置参数加载，静态方法返回值等
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ApplicationJavaTest.class }) // 指定启动类
public class ApplicationJavaTest {

    protected static Logger logger = LoggerFactory.getLogger(ApplicationJavaTest.class);

    @Test
    public void testOne() {
        logger.info("test hello 1");
    }

    @Test
    public void testTwo() {
        logger.info("test hello 2");
        TestCase.assertEquals(1, 1);
    }

    @Before
    public void testBefore() {
        logger.info("before");
    }

    @After
    public void testAfter() {
        logger.info("after");
    }
}

