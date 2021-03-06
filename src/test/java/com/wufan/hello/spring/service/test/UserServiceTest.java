package com.wufan.hello.spring.service.test;

import com.wufan.hello.spring.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.*;

/**
 * @author ：WuFan
 * @date ：Created in 2019/11/3 0003 13:35
 * @description：
 * @modified By：
 * @version: $
 */
public class UserServiceTest {

    private UserService userService;

    @Before
    public void before() {
        System.out.println("初始化数据库连接");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        userService = (UserService) applicationContext.getBean("userService");
    }

    @Test
    public void testSayHi() {

    }

    @Test
    public void testSayHello() {
        System.out.println("Hello JUnit");
    }

    @After
    public void after() {
        System.out.println("关闭数据库连接");
    }

    /**
     * 测试断言
     */
    @Test
    public void testAssert() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};
        assertEquals(obj1, obj2);
        assertSame(obj3, obj4);
        assertNotSame(obj2, obj4);
        assertNotNull(obj1);
        assertNull(obj5);
        assertTrue("为真", var1 == var2);
        assertArrayEquals(arithmetic1, arithmetic2);
    }
}
