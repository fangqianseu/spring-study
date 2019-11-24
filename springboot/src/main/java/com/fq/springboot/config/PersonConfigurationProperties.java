package com.fq.springboot.config;

import com.fq.springboot.entities.Dog;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author qianfang, at 2019-11-20, 22:01
 **/

/**
 * 自动从配置文件中获取属性
 *
 * @ConfigurationProperties 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：配置文件中哪个前缀的属性进行一一映射
 * <p>
 * 引入spring-boot-configuration-processor依赖，yml文件中有提示
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
// 校检支持
@Validated
public class PersonConfigurationProperties {
    //lastName必须是邮箱格式 @Validated校检
    // @Email
    private String lastName;
    private Integer age;
    private Boolean boss;

    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;
}
