package application.utility;

import java.util.Scanner;

public class ChoiceList extends Constants {
    // функція для вибору списку тасків
    public static void choiceList(Scanner in) {
        System.out.print("\nSelect a list of tasks:\n> ");
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
            case EXIT:
                break;
            case 1:
                ChoiceBasic.choiceBasic(in);
                break;
            case 2:
               // ChoiceConditions.choiceConditions(in);
                break;
            case 3:
                ChoiceClasses.choiceClasses(in);
                break;
            case 4:
                ChoiceLoops.choiceLoops(in);
                break;
            case 5:
                ChoiceOOP.choiceOOP(in);
                break;
            case 6:
                ChoiceString.choiceString(in);
                break;
            case 7:
                ChoiceCollections.choiceCollections(in);
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
