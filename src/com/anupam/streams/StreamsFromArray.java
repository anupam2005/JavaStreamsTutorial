package com.anupam.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsFromArray {

    public static void main(String[] args) {


        Person p01 = new Person("Paul",25);
        Person p02 = new Person("Sarah",27);
        Person p03 = new Person("James",31);
        Person p04 = new Person("Julie",25);
        Person p05 = new Person("Charles",22);
        Person p06 = new Person("Charlotte",31);
        Person p07 = new Person("Ann",27);
        Person p08 = new Person("Boris",29);
        Person p09 = new Person("Emily",34);

        Person[] people = {p01,p02,p03,p04,p05,p06,p07,p08,p09};

        //First way
        long count = Arrays.stream(people)
                            .count();
        System.out.println("Count  = "+count);

        //Secoind way
        Stream.of(people).forEach(person -> System.out.println(person.getName()));

        //sytanx sugar - method reference
        Stream.of(people).forEach(System.out::println);



    }
}
