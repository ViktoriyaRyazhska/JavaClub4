package application.utility;

import application.tasks.classes.Encapsulation;
import application.tasks.classes.FixMe;

import java.util.Scanner;

public class ChoiceClasses extends Constants{
    public static void choiceClasses() {
        Scanner in = new Scanner(System.in);
        System.out.println(listOfClasses());
        System.out.print("Select an option:\n> ");
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                ChoiceClasses.choiceClasses();
                break;
            case BACK:
                ChoiceList.choiceList();
                break;
            case EXIT:
                break;
            case 1:
                Encapsulation.task();
                ChoiceClasses.choiceClasses();
                break;
            case 2:
                FixMe.task();
                ChoiceClasses.choiceClasses();
                break;
        }
    }
    private static String listOfClasses() {
        String classes = "\nList of classes task:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Encapsulation\n" +
                "2. FixMe";

        return classes;
    }
}
