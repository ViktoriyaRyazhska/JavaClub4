package application;

import application.tasks.basic.AgeRange;
import application.tasks.basic.CuboidVolume;
import application.tasks.basic.MultiplyNumbers;
import application.tasks.basic.UnderPressure;
import application.tasks.conditions.OppositeNumber;

import java.util.Scanner;

public class Main {
    // функція для вибору списку тасків
    private static void choiceList() {
        System.out.print("\nSelect a list of tasks:\n> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
            case 0:
                break;
            case 1:
                choiceBasic();
                break;
            case 2:
                choiceConditions();
                break;
        }
    }
    // список списків з тасками
    private static String listOfLists() {
        String lists =
                "1. Basic\n" +
                "2. Conditions";

        return lists;
    }


    // функція для вибору таски з списку basic
    private static void choiceBasic() {
        System.out.println(listOfBasicOptions());
        System.out.print("Select an option:\n> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case -1:
                choiceList();
                break;
            case 1:
                UnderPressure.task();
                choiceBasic();
                break;
            case 2:
                MultiplyNumbers.task();
                choiceBasic();
                break;
            case 3:
                CuboidVolume.task();
                choiceBasic();
                break;
            case 4:
                AgeRange.task();
                choiceBasic();
                break;
        }
    }
    // список basic
    private static String listOfBasicOptions() {
        String basicOptions = "\nList of basic tasks:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Double your number\n" +
                "2. Multiply your two numbers\n" +
                "3. Calculate volume of cuboid\n" +
                "4. Age of your love\n";

        return basicOptions;
    }


    // функція для вибору таски з списку conditions
    private static void choiceConditions() {
        System.out.println(listOfConditionsOptions());
        System.out.print("Select an option:\n> ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case -1:
                choiceList();
                break;
            case 1:
                OppositeNumber.task();
                choiceConditions();
        }
    }
    // список conditions
    private static String listOfConditionsOptions() {
        String conditionsOptions = "\nList of conditions tasks:\n" +
                "-1. Back\n" +
                "0. Exit\n" +
                "1. Make your number opposite\n";

        return conditionsOptions;
    }


    public static void main(String[] args) {
        System.out.println(listOfLists());
        choiceList();
    }
}
