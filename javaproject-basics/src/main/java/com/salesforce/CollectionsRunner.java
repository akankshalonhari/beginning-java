package com.salesforce;

import com.xyzcorp.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsRunner {

    public static void main(String[] args){
        List<Person> artists = new ArrayList<>(5);
        artists.add(new Person("Mary", "Jane"));
        artists.add(new Person("John", "Shane"));
        artists.add(new Person("Arthur", "Gaye"));
        artists.add(new Person("Lady", "Wille"));
        artists.add(new Person("Gayle", "Sena"));

        System.out.println("# of artists " + artists.size());

        for(Person p : artists){
            System.out.println("Artists " + p.getFirstName());
        }

        //Classic-1
        Comparator<Person> byFirstName = new Comparator<>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        };

        System.out.println("Sorted fname");
        artists.forEach((person)->System.out.println(person));

        //Classic-2
        Collections.sort(artists, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });
        System.out.println("Sorted lname");
        artists.forEach((person)->System.out.println(person));
        //Comparator.comparing(Person::lastName);

    }
}
