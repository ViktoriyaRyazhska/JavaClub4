package conditions;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Conditions_task_12 {
    public static String switchItUp(int number) {
        String result = "";
        if (number == 0) {
            result = "Zero";
        }
        if (number == 1) {
            result = "One";
        }
        if (number == 2) {
            result = "Two";
        }
        if (number == 3) {
            result = "Three";
        }
        if (number == 4) {
            result = "Four";
        }
        if (number == 5) {
            result = "Five";
        }
        if (number == 6) {
            result = "Six";
        }
        if (number == 7) {
            result = "Seven";
        }
        if (number == 8) {
            result = "Eight";
        }
        if (number == 9) {
            result = "Nine";
        }
        if (number == 10) {
            result = "Ten";
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(switchItUp(5));
    }


    public static void solveTask() {
        System.out.println("When provided with a number between 0-9, return it in words.");
        Scanner scanner = new Scanner(System.in);

        int valueNumber = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter number:");
            String valueString = scanner.next();

            try {
                valueNumber = Integer.parseInt(valueString);
                if (valueNumber <= 10 && valueNumber >= 0) {
                    flag = false;
                } else {
                    System.out.println("Please enter a number 0-10");
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }

        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(switchItUp(valueNumber));
        System.out.println("-----------");

    }

}
