package com.fq.springboot;

import com.fq.springboot.config.PersonConfigurationProperties;
import com.fq.springboot.jpa.DeptRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @author qianfang, at 2019-11-20, 22:12
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationPropertiesTest {
    @Autowired
    PersonConfigurationProperties personConfigurationProperties;

    @Autowired
    DeptRepository deptRepository;

    @Test
    public void configurationPropertiesTest() {
        System.out.println(personConfigurationProperties);
    }

    /**
     * 测试 自定义 jpa 方法
     */
    @Test
    public void deptRepositoryTest() {
        System.out.println(deptRepository.findbyid(1));
        System.out.println(deptRepository.findbyname("womende"));
    }

    @Test
    public void deptUpdateTest() {
        System.out.println(deptRepository.updateById(1, "hello"));
    }
}
