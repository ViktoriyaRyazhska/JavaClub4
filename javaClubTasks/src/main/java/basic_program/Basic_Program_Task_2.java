package basic_program;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Basic_Program_Task_2 {
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void solveTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        String value1 = scanner.next();
        int valueIsNumers = isNumeric(value1);

        System.out.println("Enter second number:");
        String value2 = scanner.next();
        int valueIsNumers2 = isNumeric(value2);


        System.out.println("So, now i will multiply this numbers\nResult: ");
        System.out.println("-----------");
        System.out.println(multiply(valueIsNumers, valueIsNumers2));
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
