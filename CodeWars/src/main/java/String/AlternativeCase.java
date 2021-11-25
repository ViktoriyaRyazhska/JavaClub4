package com.company1;

public class AlternativeCase {
    public static String toAlternativeString(String string) {
        return string.chars()
                .mapToObj(y -> (char) y)
                .map(y -> Character.isUpperCase(y) ? Character.toLowerCase(y): Character.toUpperCase(y))
                .map(String::valueOf)
                .reduce("", String::concat);
    }
}
