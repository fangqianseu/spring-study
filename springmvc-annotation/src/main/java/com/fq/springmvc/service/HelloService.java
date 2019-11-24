package com.fq.springmvc.service;

import org.springframework.stereotype.Service;

/**
 * @author qianfang, at 2019-11-20, 17:22
 **/
@Service
public class HelloService {
    public String hello(String name) {
        return "hello, " + name;
    }
}
