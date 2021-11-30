package application.utility;

import application.tasks.classes.*;

import java.util.Scanner;

public class ChoiceClasses extends Constants{
    public static void choiceClasses(Scanner scanner) {
        System.out.println(listOfClasses());
        System.out.print("\nSelect an option:\n> ");
        int option = scanner.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                ChoiceClasses.choiceClasses(scanner);
                break;
            case BACK:
                ChoiceList.choiceList(scanner);
                break;
            case EXIT:
                break;
            case 1:
                Encapsulation.task();
                ChoiceClasses.choiceClasses(scanner);
                break;
            case 2:
                FixMe.task();
                ChoiceClasses.choiceClasses(scanner);
                break;
            case 3:
                Canvas.task(scanner);
                ChoiceClasses.choiceClasses(scanner);
                break;
            case 4:
                FractionsClass.task();
                ChoiceClasses.choiceClasses(scanner);
                break;
            case 5:
                //BuildingBlocks.task(scanner);
                ChoiceClasses.choiceClasses(scanner);
                break;
            case 6:
                //TwoFightersOneWinner.task(scanner);
                ChoiceClasses.choiceClasses(scanner);
                break;
        }
    }
    private static String listOfClasses() {
        String classes = "\nList of classes task:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Encapsulation\n" +
                "2. FixMe\n" +
                "3. Canvas\n" +
                "4. Fractions\n" +
                "5. Building Blocks\n" +
                "6. Two Fighters - one Winner";

        return classes;
    }
}
