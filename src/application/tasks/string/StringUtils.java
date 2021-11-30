package application.tasks.string;

import java.util.Locale;
import java.util.Scanner;

public class StringUtils {
    private static String toAlternativeString(String string) {
        // your code here!
        StringBuilder builder = new StringBuilder();
        String[] array = string.split("");
        for (String letter : array) {
            if (letter == letter.toLowerCase(Locale.ROOT)) {
               builder.append( letter.toUpperCase(Locale.ROOT));

            } else if (letter == letter.toUpperCase(Locale.ROOT)) {
                builder.append(letter.toLowerCase(Locale.ROOT));
            }
        }
        return builder.toString();
    }
    public String getToAlternativeString(String string) {
        return toAlternativeString(string);
    }

    public static void task(Scanner in) {
        in.nextLine();
        System.out.println("Enter sentence any sentence to see an ALTerNAtiNG CaSe:");
        String sentence = in.nextLine();
        System.out.println(toAlternativeString(sentence));
    }
}
