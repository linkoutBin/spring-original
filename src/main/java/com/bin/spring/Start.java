package com.bin.spring;

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
            Service timeService = (Service) context.getBean("timeService");
            log.info(timeService.showTime());
        } catch (BeansException be) {
            log.info(be.getMessage());
        }
    }
}
