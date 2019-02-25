package com.bin.spring;

import com.bin.spring.domain.User;
import com.bin.spring.service.Service;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class Start {

    private static Logger log = Logger.getLogger("Start.class");

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            context.start();
            log.info("spring started now!");
            log.info("system.properties:"+System.getProperties());
            Service service = (Service) context.getBean("service");
            log.info(service.showTime());
            User user = new User();
            user.setName("wangwu");
            service.addByJpa(user);
            //log.info("开始查询数据库:" + service.add(user));
        } catch (BeansException be) {
            log.info(be.getMessage());
        }
    }
}
