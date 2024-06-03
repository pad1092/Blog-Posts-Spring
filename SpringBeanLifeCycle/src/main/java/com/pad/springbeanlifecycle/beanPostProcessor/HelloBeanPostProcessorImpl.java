package com.pad.springbeanlifecycle.beanPostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class HelloBeanPostProcessorImpl implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName){
        if(bean instanceof HelloBean) {
            System.out.println(String.format("Greeting's values of %s is %s", beanName, ((HelloBean) bean).sayHello()));
            bean = new HelloBean("This message was set by postProcessBeforeInitialization method");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if(bean instanceof HelloBean){
            return new HelloBean("This message was set by postProcessAfterInitialization method");
        }
        return bean;
    }
}
