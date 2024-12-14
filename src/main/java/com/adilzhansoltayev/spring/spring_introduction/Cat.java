package com.adilzhansoltayev.spring.spring_introduction;
import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("cat created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
