package application.tasks.Conditions;

import java.util.Scanner;

public class BooleanToString {
    private static String convert(boolean flag) {
        String result = "false";
        if (flag == true) {
            result = "true";
        }
        return result;
    }

    private static boolean input(int option) {
        boolean flag = false;
        switch (option) {
            default:
                System.out.println("Error.. invalid input");
                task();
                break;
            case 1:
                flag = true;
                break;
            case 2:
                flag = false;
                break;
        }

        return flag;
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Select an option:\n1. True\n2. False\n> ");
        int option = in.nextInt();
        System.out.println("Result: " + convert(input(option)));
    }
}
