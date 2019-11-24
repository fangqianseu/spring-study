package com.fq.spring.postProcessor;

import com.fq.spring.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 *  ��2������
 * 		postProcessBeanDefinitionRegistry();
 * 		������bean������Ϣ�ѱ����أ���beanʵ����δ�����ģ�
 *      ������BeanFactoryPostProcessorִ�У�
 * 		����BeanDefinitionRegistryPostProcessor���������ٶ������һЩ�����
 *
 * 	ԭ��
 * 		1����ioc��������
 * 		2����refresh()-��invokeBeanFactoryPostProcessors(beanFactory);
 * 		3�����������л�ȡ�����е�BeanDefinitionRegistryPostProcessor�����
 * 			1�����δ������е�postProcessBeanDefinitionRegistry()����
 * 			2����������postProcessBeanFactory()����BeanFactoryPostProcessor��
 *
 * 		4�����������������ҵ�BeanFactoryPostProcessor�����Ȼ�����δ���postProcessBeanFactory()����
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...bean��������" + beanFactory.getBeanDefinitionCount());
    }

    //BeanDefinitionRegistry��Bean������Ϣ�ı������ģ��Ժ�BeanFactory���ǰ���BeanDefinitionRegistry���汣���ÿһ��bean������Ϣ����beanʵ����
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("postProcessBeanDefinitionRegistry...bean��������" + registry.getBeanDefinitionCount());

        // 2���¼�beandefinition����
        //RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();

        registry.registerBeanDefinition("hello", beanDefinition);
    }

}
