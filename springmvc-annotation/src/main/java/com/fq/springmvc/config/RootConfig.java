package com.fq.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * spring������
 * ��ɨ��controller;
 * ���ڴ��� service�� �� dao ��
 */
@ComponentScan(value = "com.fq.springmvc", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class RootConfig {

}
