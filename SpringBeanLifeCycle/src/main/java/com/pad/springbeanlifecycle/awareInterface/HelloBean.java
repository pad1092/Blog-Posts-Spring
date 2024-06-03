package com.pad.springbeanlifecycle.awareInterface;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public HelloBean(){

    }
    public String sayHello(){
        return "HELLOOOOOOOOO";
    }
}
