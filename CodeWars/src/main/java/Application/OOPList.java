package Application;

import Errors.NotANumber;
import OOP.AdamAndEve;

import java.util.Scanner;

public class OOPList {
    public static String oopList() {
        String tasks =
                "1 - Basic subclasses Adam and Eve\n" +
                        "2 - Rotations and reflections i \n" +
                        "3 - L3375p34k\n" +
                        "4 - Tdd area calculations";

        return tasks;
    }

    public static void choiceOOP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice : ");
        int num = NotANumber.CheckInt(scanner);
        try {
            switch (num) {
                default -> System.out.println("The is no such a task");
                case 1 -> {
                    System.out.println(AdamAndEve.create());
                }
                case 2 -> {
                }
                case 3 -> {
                    break;
                }
                case 4 -> {

                }
            }
        } finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}

