package com.abccorp;

import com.xyzcorp.Person;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Hello World Akanksha");

        Person person1 = new Person("Mary", "Jane");
        Person person2 = new Person("John", "Shane");

        System.out.println(person1.getFirstName());
        System.out.println(person2.getLastName());
    }
}