package com.anupam.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SkippingAndLimiting {
    public static void main(String[] args) {

        //skip first 10 and then last 10 elements
        IntStream.range(0,30)
                .skip(10)
                .limit(10)
                .forEach(item  -> System.out.print(item + " "));


        //same can be done on other type of stream too
        Path path = Path.of("data/names.txt");

        try (Stream<String> lines = Files.lines(path)) { //try with resource
            lines.skip(2)
                    .limit(3)
                    .forEach(line -> System.out.println(line));
        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
