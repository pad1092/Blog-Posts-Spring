package com.pad.springbeanlifecycle.customInitDestroyMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public FileManager fileManager(){
        return new FileManager();
    }
}
