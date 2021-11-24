package application.utility;

import application.tasks.string.*;

import java.util.Scanner;

public class ChoiceString extends Constants {
    private static void choiceString(Scanner scanner) {
        System.out.println(listOfString());
        System.out.print("Select an option:\n> ");
        switch (scanner.nextInt()) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case EXIT:
                break;
            case BACK:
                ChoiceList.choiceList();
                break;
            case 1:
                Banjo.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 2:
                NumberToString.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 3:
                ReplaceDots.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 4:
                ReverseString.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 5:
                Welcome.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
        }
    }
    private static String listOfString() {
        String string = "\nList of of string task:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Are you playing banjo\n" +
                "2. Convert number to String\n" +
                "3. Replace all dots\n" +
                "4. Reverse string\n" +
                "5. Print welcome message";

        return string;
    }
}
