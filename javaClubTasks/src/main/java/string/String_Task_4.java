package string;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class String_Task_4 {
    public static int opposite(int number) {
        return number - number * 2;
    }

    public static void solveTask() {
        System.out.println("given a number, find its opposite.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        String value1 = scanner.next();
        int valueIsNumers = isNumeric(value1);

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(opposite(valueIsNumers));
        System.out.println("-----------");

    }

    public static int isNumeric(String str) {
        int value = 0;
        try {
            value = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect Data, please enter a number!");
            chooseMenu();
        }
        return value;
    }

}
