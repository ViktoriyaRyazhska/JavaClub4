package application.tasks.string;

import java.util.Locale;
import java.util.Scanner;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        return name;
    }

    public static String correct(String string) {
        StringBuilder builder = new StringBuilder();
        //splits  string  into two words array
        String array[] = string.split(" ");
        int count = 0;
        //splits each word
        for (String word : array) {
            String array1[] = word.split("");
            //add . between name  and surname
            if (count > 0)
                builder.append(".");
            for (String letter : array1) {
                if (letter.matches("[a-zA-Z]") && letter.matches(array1[0])) {
                    builder.append(letter.toUpperCase(Locale.ROOT));
                    count++;
                }
            }
        }
        return builder.toString();
    }

    public String getCorrect(String string) {
        return correct(string);
    }

    public static void task(Scanner in) {
        in.nextLine();
        System.out.println("Enter any first and last name, each word starts with capital letter");
        String name = in.nextLine();
        System.out.println("Abbreviation for the " + name + " is: " + correct(name));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AbbreviateTwoWordName.task(in);
    }
}
