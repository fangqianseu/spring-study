package com.fq.spring;

import com.fq.spring.bean.Car;
import com.fq.spring.postProcessor.PostProcessorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qianfang, at 2019-11-19, 15:28
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PostProcessorConfig.class);
        Car bean = applicationContext.getBean(Car.class);
    }
}
