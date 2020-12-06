package com.anupam.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SimplifiedForloop {

    /*
    * Objective:- Find Average of people whose agr is over 20
    * */

    public static void main(String[] args) {

        Person p01 = new Person("Paul",21);
        Person p02 = new Person("Sarah",12);
        Person p03 = new Person("James",31);
        Person p04 = new Person("Julie",25);
        Person p05 = new Person("Charles",22);
        Person p06 = new Person("Charlotte",31);
        Person p07 = new Person("Ann",17);
        Person p08 = new Person("Boris",29);
        Person p09 = new Person("Emily",34);

        List<Person> people = new ArrayList<Person>(List.of(p01,p02,p03,p04,p05,p06,p07,p08,p09));

// aam zindagi
        int sum = 0;
        int count =0;
        double average = 0.0d;

        List<Integer> ages = new ArrayList<Integer>();

        for(Person person:people){
            if(person.getAge() > 20){
                sum+= person.getAge();
                count++;
            }
        }

        if (count > 0) {

            System.out.println("sum = "+sum);
            System.out.println("count = "+count);
            average = sum / count;
        }

            System.out.println("average = "+average);

//Mentos zindagi - meaning refactored samrt alternative of above ;)

        OptionalDouble result = people.stream()
                .mapToInt(person -> person.getAge())
                .filter(age -> age > 20)
                .average();

        double averageSmart = result.isPresent() ? result.getAsDouble() : 0.0;

        System.out.println("averageSmart = " + averageSmart);


    }
}
