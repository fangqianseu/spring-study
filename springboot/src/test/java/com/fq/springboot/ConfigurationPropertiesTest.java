package com.fq.springboot;

import com.fq.springboot.config.PersonConfigurationProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author qianfang, at 2019-11-20, 22:12
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationPropertiesTest {
    @Autowired
    PersonConfigurationProperties personConfigurationProperties;

    @Test
    public void configurationPropertiesTest(){
        System.out.println(personConfigurationProperties);
    }
}
