package com.adilzhansoltayev.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet {

    public Dog() {
        System.out.println("dog created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("class dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("class dog: destroy method");
//    }
}
