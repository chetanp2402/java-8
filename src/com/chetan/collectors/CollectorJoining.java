package com.chetan.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorJoining {


    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Jimmy", 25),
                new Person("Madhu", 19),
                new Person("John", 22),
                new Person("Carrie", 22),
                new Person("Jacob", 18),
                new Person("Harry", 19),
                new Person("Sam", 20));

        // joining names in single string with some delimiter
        String names = persons.stream().map(Person::getName).collect(Collectors.joining(", "));

        System.out.println(names);
    }
}
