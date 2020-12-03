package com.anupam.streams;

import java.util.ArrayList;
import java.util.List;

public class FirstStreamsSmart {

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
        Person p10 = new Person("",34);

        List<Person> people = new ArrayList<Person>(List.of(p01,p02,p03,p04,p05,p06,p07,p08,p09,p10));

        long emptyCount = people.stream()
                                .map(person -> person.getName())
                                .filter(name -> name.isEmpty())
                                .count();

        long nonEmptyCount = people.stream()
                                    .map(person -> person.getName())
                                    .filter(name -> !name.isEmpty())
                                    .count();

        System.out.println("Count empty value = "+emptyCount);
        System.out.println("Count non-empty value = "+nonEmptyCount);
    }

}
