package application.utility;

import java.util.Scanner;

public class ChoiceConditions {

    // функція для вибору таски з списку conditions
    public static void choiceConditions() {
        System.out.println(listOfConditionsOptions());
        System.out.print("Select an option:\n> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case Constants.EXIT:
                break;
            case Constants.BACK:
                ChoiceList.choiceList();
                break;
            case 1:

        }
    }
    // список conditions
    public static String listOfConditionsOptions() {
        String conditionsOptions = "\nList of conditions tasks:\n" +
                "-1. Back\n" +
                "0. Exit\n";

        return conditionsOptions;
    }
}
