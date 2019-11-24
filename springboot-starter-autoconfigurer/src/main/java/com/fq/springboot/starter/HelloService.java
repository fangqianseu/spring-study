package com.fq.springboot.starter;

/**
 * @author qianfang, at 2019-11-24, 23:11
 **/
public class HelloService {
    HelloProperties helloProperties;


    public String sayHellAtguigu(String name) {
        return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
