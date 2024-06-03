package com.pad.springbeanlifecycle.initDestroyInteface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class FileManager implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy: Clear all temporary file");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After set properties: perform some calculation");
    }
}