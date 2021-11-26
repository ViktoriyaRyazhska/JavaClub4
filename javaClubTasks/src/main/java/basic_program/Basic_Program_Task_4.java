package basic_program;

import string.String_Task_4;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Basic_Program_Task_4 {

    public static int century(int year) {
        int century;
        int result = year % 100;

        if (result != 0) {
            century = year / 100 + 1;
        } else {
            century = year / 100;
        }
        return century;
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
    }

    public static void solveTask() {
        System.out.println("This method takes a year and returns a century");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");

        String value1 = scanner.next();
        int valueIsNumers = isNumeric(value1);



        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(century(valueIsNumers));
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
