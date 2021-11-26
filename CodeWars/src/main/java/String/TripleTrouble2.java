package com.company1;

public class TripleTrouble2 {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < one.length(); i++)
            builder.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        return builder.toString();
    }
}
