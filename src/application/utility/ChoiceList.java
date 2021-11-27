package application.utility;

import java.util.Scanner;

public class ChoiceList {
    // функція для вибору списку тасків
    public static void choiceList() {
        System.out.print("\nSelect a list of tasks:\n> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
            case Constants.EXIT:
                break;
            case 1:
                ChoiceBasic.choiceBasic();
                break;
            case 2:
               // ChoiceConditions.choiceConditions();
                break;
        }
    }
    // список списків з тасками
    public static String listOfLists() {
        String lists =
                "1. Basic\n" +
                        "2. Conditions\n" +
                        "3. Classes";

        return lists;
    }
}
