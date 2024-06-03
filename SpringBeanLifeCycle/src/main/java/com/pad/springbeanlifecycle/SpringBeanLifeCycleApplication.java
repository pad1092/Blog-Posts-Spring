package com.pad.springbeanlifecycle;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

    public static void main(String[] args) {
//        ApplicationContext context1 =
//                new AnnotationConfigApplicationContext(com.pad.springbeanlifecycle.awareInterface.FileManager.class,
//                                                        com.pad.springbeanlifecycle.awareInterface.HelloBean.class);
//        ApplicationContext context2 =
//                new AnnotationConfigApplicationContext(com.pad.springbeanlifecycle.beanPostProcessor.BeanConfiguration.class,
//                                                        com.pad.springbeanlifecycle.beanPostProcessor.HelloBeanPostProcessorImpl.class);

//        com.pad.springbeanlifecycle.beanPostProcessor.HelloBean helloBean =
//                (com.pad.springbeanlifecycle.beanPostProcessor.HelloBean) context2.getBean("helloBean");
//        System.out.println("Greeting after all: " + helloBean.sayHello());

//        AbstractApplicationContext context3 =
//                new AnnotationConfigApplicationContext(com.pad.springbeanlifecycle.initDestroyInteface.FileManager.class);
//        context3.registerShutdownHook();

        AbstractApplicationContext context4 =
                new AnnotationConfigApplicationContext(com.pad.springbeanlifecycle.customInitDestroyMethod.BeanConfiguration.class);
        context4.registerShutdownHook();
    }

}
