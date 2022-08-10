package com.chetan.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

        // Find person with min age
        Optional<Person> minAgePersonOpt = persons.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(minAgePersonOpt);

        // joining names in single string with some delimiter
        String names = persons.stream().map(Person::getName).collect(Collectors.joining(", "));

        System.out.println(names);

        //Grouping person objects by age using collector
        // No downstream collector used
        Map<Integer, List<Person>> mapByAge = persons.stream().collect(
                Collectors.groupingBy(Person::getAge)
        );

        System.out.println(mapByAge);

        //Grouping person objects by age using collector and counting
        // Downstream collector used for counting
        Map<Integer, Long> mapByAgeForCounting = persons.stream().collect(
                Collectors.groupingBy(Person::getAge, Collectors.counting())
        );

        System.out.println(mapByAgeForCounting);

        //Grouping person objects by age using collector and collecting names in a list
        // Downstream collector used for counting
        Map<Integer, List<String>> mapByAgeWithNameOfPerson = persons.stream().collect(
                Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));


        System.out.println(mapByAgeWithNameOfPerson);



    }
}
