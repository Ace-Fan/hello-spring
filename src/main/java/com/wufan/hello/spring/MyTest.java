package com.wufan.hello.spring;

import com.wufan.hello.spring.service.UserService;
import com.wufan.hello.spring.service.impl.UserServiceImpl;
import javafx.application.Application;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：WuFan
 * @date ：Created in 2019/11/2 0002 21:38
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-context.xml");
        UserService Service = (UserService) applicationContext.getBean("userService");
        Service.sayHi();

        logger.info("信息级别日志");
        logger.debug("调试级别日志");
        logger.warn("警告级别日志");
        logger.error("错误级别日志");

        String message = "测试";
        String message2 = "测试2";
        logger.info("message is：{} {}",message,message2);

        System.out.println(String.format("message is : %s %s",message,message2));
        System.out.println(message.concat(message2));
    }

}
