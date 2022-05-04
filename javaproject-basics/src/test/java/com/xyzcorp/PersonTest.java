package com.xyzcorp;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void testEquality(){
        Person person1 = new Person("Mary", "Jane");
        Person person2 = new Person("Mary", "Jane");
        System.out.println(person1); // uses toString()
        assertTrue(person1.equals(person2)); // uses equals()
        assertTrue((person1.getFirstName()).equals(person2.getFirstName()));
    }

    @Test
    public void testInequality(){
        Person person1 = new Person("Mary", "Jane");
        Person person2 = new Person("mary", "jane");

        assertFalse(person1.equals(person2));
        assertFalse((person1.getFirstName()).equals(person2.getFirstName()));
        assertFalse(person1.equals(30));
    }

    @Test
    public void testHashEquality(){
        Person person1 = new Person("Mary", "Jane");
        Person person2 = new Person("Mary", "Jane");
        assertTrue(person1.equals(person2)); // uses equals()
        assertTrue((person1.getFirstName()).equals(person2.getFirstName()));
        String hashPerson1 = String.valueOf(person1.hashCode());
        String hashPerson2 = String.valueOf(person2.hashCode());
        assertTrue(hashPerson1.equals(hashPerson2));
    }

    @Test
    public void testHashInEquality(){
        Person person1 = new Person("Mary", "Jane");
        Person person2 = new Person("mary", "jane");
        assertFalse(person1.equals(person2)); // uses equals()
        assertFalse((person1.getFirstName()).equals(person2.getFirstName()));
        String hashPerson1 = String.valueOf(person1.hashCode());
        String hashPerson2 = String.valueOf(person2.hashCode());
        assertFalse(hashPerson1.equals(hashPerson2));
    }

}