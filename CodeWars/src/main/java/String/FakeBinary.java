package com.company1;

public class FakeBinary {
/*    public static String fakeBin(String numberString) {
        StringBuilder builder = new StringBuilder();
        for (String str: numberString.split(""))
            builder.append((Integer.parseInt(str) < 5) ? "0" : "1");
        return builder.toString();
    }*/
    public static String fakeBin(String numberString) {
        return numberString.chars()
                .mapToObj(x -> (x < '5') ? "0" : "1")
                .reduce("", String::concat);
    }
}
