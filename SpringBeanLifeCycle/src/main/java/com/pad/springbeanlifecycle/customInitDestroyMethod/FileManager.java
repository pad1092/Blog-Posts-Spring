package com.pad.springbeanlifecycle.customInitDestroyMethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FileManager implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy: Clear all temporary file");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After set properties: perform some calculation");
    }

    public void initMethod(){
        System.out.println("Custom init-method");
    }
    public void destroyMethod(){
        System.out.println("Custom destroy-method");
    }
}
