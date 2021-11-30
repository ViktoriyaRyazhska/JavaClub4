package tasks.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlternativeString {
    public static String toAlternativeString(String string){
        return Arrays.stream(string.split(""))
                .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
                .collect(Collectors.joining(""));
    }
}
