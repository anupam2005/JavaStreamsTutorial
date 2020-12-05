package com.anupam.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.LongStream.iterate;

public class DropWhileTakeWhile {

    /*
    * Objective: Take a class and trace its super classes till Object
    * */


    public static void main(String[] args) {

        Class<?> clzz = ArrayList.class;

        //1. How NOT to do it: Following prints the class upto null with nullpointer exception
        /*Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
                .forEach(System.out::println);*/

        //2. How NOT to do it: This will filter out the null value printing but will still shows exception
       /* Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
                .filter(c -> c != null)
                .forEach(System.out::println);*/

        //3. How to do it
        Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
                .takeWhile(c -> c != null)
                .forEach(System.out::println);

        List.of("Anupam","Deepak","Aditya","Vivek").stream()
                .dropWhile(name -> name.startsWith("A"))
                .forEach(System.out::println);




    }






}
