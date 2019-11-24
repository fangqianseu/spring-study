package com.fq.springmvc.config;


import com.fq.springmvc.interceptor.MyFirstInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author fq
 * SpringMVC������
 * ֻɨ��Controller��
 */
@ComponentScan(value = "com.fq.springmvc", includeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {

    //����

    //��ͼ������
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //Ĭ�����е�ҳ�涼�� /WEB-INF/ xxx .jsp
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    //��̬��Դ����
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //������
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyFirstInterceptor()).addPathPatterns("/**");
    }

}
