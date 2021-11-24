package application.utility;

import application.tasks.classes.Canvas;
import application.tasks.classes.Encapsulation;
import application.tasks.classes.FixMe;
import application.tasks.classes.FractionsClass;

import java.util.Scanner;

public class ChoiceClasses extends Constants{
    public static void choiceClasses(Scanner scanner) {
        System.out.println(listOfClasses());
        System.out.print("Select an option:\n> ");
        int option = scanner.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                ChoiceClasses.choiceClasses(scanner);
                break;
            case BACK:
                ChoiceList.choiceList();
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
                Canvas.task();
                ChoiceClasses.choiceClasses(scanner);
                break;
            case 4:
                FractionsClass.task();
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
                "4. Fractions";

        return classes;
    }
}
