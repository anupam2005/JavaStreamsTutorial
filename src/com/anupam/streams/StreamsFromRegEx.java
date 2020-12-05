package com.anupam.streams;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamsFromRegEx {

    public static void main(String[] args) {

        String sentence = "what matters most is how you walk through the fire";

        //unsmart way to do it
        String[] words = sentence.split(" "); // not smart as creating an intermediate array
        Stream<String> wordStream = Stream.of(words);
        long count = wordStream.count();
        System.out.println("Count = "+ count);

        //smart way to do it
        Pattern pattern = Pattern.compile(" ");
        Stream<String> wordStream2 = pattern.splitAsStream(sentence); // smart way as not intermediate array
        long smartCount = wordStream2.count();
        System.out.println("Smart Count = "+ smartCount);

    }




}
