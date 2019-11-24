package com.fq.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author qianfang, at 2019-11-24, 23:08
 **/
@ConfigurationProperties(prefix = "fq.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
