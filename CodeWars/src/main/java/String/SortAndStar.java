package com.company1;
import java.util.stream.Stream;
import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        return String.join("***", Arrays.stream(s).sorted().limit(1).findAny().orElse(""));
    }
}
