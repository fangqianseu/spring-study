package com.fq.springboot.test;

import com.fq.springboot.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianfang, at 2019-11-24, 23:41
 **/
@RestController
public class TestController {
    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.sayHellAtguigu("starter");
    }
}
