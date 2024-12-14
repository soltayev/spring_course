package com.adilzhansoltayev.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat1.say();

        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
        System.out.println(person.getSurname() + " " + person.getAge());
        context.close();
    }
}
