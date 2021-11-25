package com.company1;

public class AllStarCodeChallengeNumber18 {
    public static int strCount(String str, char letter) {
        return (int) str.chars()
                .mapToObj(x -> (char) x)
                .filter(x -> x.equals(letter))
                .count();
    }
}
