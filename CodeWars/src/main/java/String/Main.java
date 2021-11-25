package com.company1;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String... args) {
        String str = "HeLLo WoRLD";
        char letter = 'L';

        long result = str.chars()
                .mapToObj(x -> (char) x)
                .filter(x -> x.equals(letter))
                .count();
        System.out.println(result);

    }

}
