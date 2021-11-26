package com.company;
import java.util.*;

public class MyHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
