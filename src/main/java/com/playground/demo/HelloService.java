package com.playground.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloService implements  HelloRepo{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
