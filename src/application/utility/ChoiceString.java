package application.utility;

import application.tasks.string.*;

import java.util.Scanner;

public class ChoiceString extends Constants {
    public static void choiceString(Scanner scanner) {
        System.out.println(listOfString());
        System.out.print("\nSelect an option:\n> ");
        int option = scanner.nextInt();
        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case EXIT:
                break;
            case BACK:
                ChoiceList.choiceList(scanner);
                break;
            case 1:
                AbbreviateTwoWordName.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 2:
                AllStarCodeChallenge.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 3:
                Banjo.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 4:
                CorrectTheMistakes.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 5:
                //FakeBinary.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 6:
                //FindThePosition.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 7:
                //GrasshopperDebug.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 8:
                //IntFromChar.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 9:
                NumberToString.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 10:
                RemoveExclamationMarks.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 11:
                //RemoveString.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 12:
                ReplaceDots.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 13:
                ReverseString.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 14:
                SortAndStar.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 15:
                StringUtils.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 16:
                //TripleTrouble.task(scanner);
                ChoiceString.choiceString(scanner);
                break;
            case 17:
                Welcome.task(scanner);
                ChoiceString.choiceString(scanner);
                break;

        }
    }
    private static String listOfString() {
        String string = "\nList of of string task:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Abbreviate Two Word Name\n" +
                "2. All Star Code Challenge\n" +
                "3. Banjo\n" +
                "4. Correct the Mistakes\n" +
                "5. Fake Binary\n" +
                "6. Find the Position\n" +
                "7. Grasshopper Debug\n" +
                "8. Int from Char\n" +
                "9. Number to String\n" +
                "10. Remove Exclamation Marks\n" +
                "11. Remove String\n" +
                "12. Replace Dots\n" +
                "13. Reverse String\n" +
                "14. Sort And Star\n" +
                "15. String Utils\n" +
                "16. Triple Trouble\n" +
                "17. Welcome";

        return string;
    }
}
