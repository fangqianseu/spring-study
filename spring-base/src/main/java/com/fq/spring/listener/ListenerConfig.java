package com.fq.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qianfang, at 2019-11-19, 22:32
 **/
@Configuration
@ComponentScan("com.fq.spring.listener")
public class ListenerConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ListenerConfig.class);

        applicationContext.publishEvent(new ApplicationEvent("new event") {
        });

        applicationContext.close();
    }
}
