package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        return Arrays.stream(name.toUpperCase().split(" "))
                .map(x -> x.substring(0, 1))
                .collect(Collectors.joining("."));
    }
}
