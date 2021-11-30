package application.tasks.string;

import java.util.Scanner;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
    return name;
}
    public static String correct(String string) {
        StringBuilder builder = new StringBuilder();
        String array[] = string.split("");
        int count = 0;

        for (String letter : array) {
            if (letter.matches("[A-Z]")) {
                builder.append(letter);
                count++;
            }
            if (count == 1) {
                builder.append(".");
                count++;
            }
        }
        return builder.toString();
    }

    private static void task(Scanner in) {
        System.out.println("Enter any first and last name, so each word starts with capital letter");
        String name = in.nextLine();
        correct(name);
    }
}
