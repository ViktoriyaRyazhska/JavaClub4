package application.utility;

import application.tasks.basic.*;
import application.tasks.oop.AdamAndEve;
import application.tasks.oop.TddAreaCalculations;
import java.util.Scanner;

public class ChoiceOOP {
    public static void choiceOOP(Scanner in) {
        System.out.println(listOfOOPOptions());
        System.out.print("Select an option:\n> ");
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case -1:
                ChoiceList.choiceList(in);
                break;
            case 1:
              //  AdamAndEve.task(in);
                ChoiceOOP.choiceOOP(in);
                break;
            case 2:
                //   L3375p34k.task(in);
                ChoiceOOP.choiceOOP(in);
                break;
            case 3:
                //  Rotations.task(in);
                ChoiceOOP.choiceOOP(in);
                break;
            case 4:
               // TddAreaCalculations.task(in);
                ChoiceOOP.choiceOOP(in);
                break;
        }
    }
    // список basic
    public static String listOfOOPOptions() {
        String oopOptions =
                "\nList of basic tasks:\n" +
                        "1. AdamAndEve\n" +
                        "2. L3375p34k\n" +
                        "3. Rotations\n" +
                        "4. tddAreaCalculations\n" +
                        "-1. Back\n" +
                        "0. Exit\n";

        return oopOptions;
    }
}
