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

        int valueNumber = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter the year:");
            String valueString = scanner.next();

            try {
                valueNumber = Integer.parseInt(valueString);
                flag = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }

        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(opposite(valueNumber));
        System.out.println("-----------");

    }


}
