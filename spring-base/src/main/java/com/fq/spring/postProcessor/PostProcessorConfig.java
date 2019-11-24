package com.fq.spring.postProcessor;

import com.fq.spring.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qianfang, at 2019-11-19, 22:21
 **/

@Configuration
@ComponentScan("com.fq.spring.postProcessor")
public class PostProcessorConfig {
    @Bean
    public Car car() {
        return new Car();
    }
}
