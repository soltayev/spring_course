package com.adilzhansoltayev.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person( Pet pet) {
        System.out.println("person created");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("person created");
//        this.pet = pet;
//    }

//    public Person() {
//        System.out.println("Person constructor");
//    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet( Pet pet) {
        System.out.println("person set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my pet");
        pet.say();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("person set age");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("person set surname");
        this.surname = surname;
    }
}
