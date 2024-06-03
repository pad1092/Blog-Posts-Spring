package com.pad.springbeanlifecycle.beanPostProcessor;

public class HelloBean {
    private String greeting;
    public HelloBean(){

    }
    public HelloBean(String greeting){
        this.greeting = greeting;
    }
    public String sayHello(){
        return greeting;
    }

    public void initMethod(){
        System.out.println("CUSTOM INIT METHOD: " + greeting);
    }
}
