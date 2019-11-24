package com.fq.spring.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *
 * BeanFactoryPostProcessor��beanFactory�ĺ��ô�������
 * 		��BeanFactory��׼��ʼ��֮����ã������ƺ��޸�BeanFactory�����ݣ�
 * 		���е�bean�����Ѿ�������ص�beanFactory������bean��ʵ����δ����
 *
 *
 * BeanFactoryPostProcessorԭ��:
 * 1)��ioc������������
 * 2)��invokeBeanFactoryPostProcessors(beanFactory);
 * 		����ҵ����е�BeanFactoryPostProcessor��ִ�����ǵķ�����
 * 			1����ֱ����BeanFactory���ҵ�����������BeanFactoryPostProcessor���������ִ�����ǵķ���
 * 			2�����ڳ�ʼ�������������ǰ��ִ��
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor...postProcessBeanFactory...");
        int count = beanFactory.getBeanDefinitionCount();
        String[] names = beanFactory.getBeanDefinitionNames();
        System.out.println("��ǰBeanFactory����" + count + " ��Bean");
        System.out.println(Arrays.asList(names));
    }

}
