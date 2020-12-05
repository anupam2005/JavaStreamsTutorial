package com.anupam.streams;

public class StreamsFromString {

    public static void main(String[] args) {

        String sentence = "the quick brown fox jumps over the lazy dog";
        String sentenceCaps = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String sentenceMixed = "The Quick Brown Fox Jumps Over The Lazy Dog";

        sentence.chars()
                .mapToObj(asciCode -> Character.toString(asciCode))
                .filter(str ->!str.isEmpty())
                .distinct()
                .sorted()
                .forEach(item -> System.out.print(item));

        sentenceCaps.chars()
                .mapToObj(asciCode -> Character.toString(asciCode))
                .filter(str ->!str.isEmpty())
                .distinct()
                .sorted()
                .forEach(item -> System.out.print(item));

        sentenceMixed.chars()
                .mapToObj(asciCode -> Character.toString(asciCode))
                .filter(str ->!str.isEmpty())
                .distinct()
                .sorted()
                .forEach(item -> System.out.print(item));

    }
}
