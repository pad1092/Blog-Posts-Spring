package com.pad.springbeanlifecycle.awareInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.IOException;

public class FileManager implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getBean("helloBean"));
        HelloBean helloBean = (HelloBean) beanFactory.getBean("helloBean");
        System.out.println(helloBean.sayHello());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(String.format("Bean's name is %s", name));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        try {
            System.out.println(applicationContext.getResource("test.txt").getFile().getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        HelloBean helloBean = (HelloBean) applicationContext.getBean("helloBean");
        System.out.println(helloBean.sayHello());
    }
}
