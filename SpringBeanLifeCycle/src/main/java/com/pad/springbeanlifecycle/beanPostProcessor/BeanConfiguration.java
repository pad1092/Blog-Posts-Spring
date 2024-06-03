package com.pad.springbeanlifecycle.beanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean(initMethod = "initMethod")
    public HelloBean helloBean(){
        return new HelloBean();
    }
}
