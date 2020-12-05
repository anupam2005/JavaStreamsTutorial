package com.anupam.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamsFromTextFile {

    public static void main(String[] args) {

        Path path = Path.of("data/names.txt");

        try (Stream<String> lines = Files.lines(path)) { //try with resource
            lines.forEach(line -> System.out.println(line));
        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }

}
