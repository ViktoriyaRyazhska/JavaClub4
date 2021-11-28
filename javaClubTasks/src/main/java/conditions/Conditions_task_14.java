package conditions;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Conditions_task_14 {
    public static int rentalCarCost(int d) {
        int result = 0;

        if (d >= 1 && d <= 2) {
            result = 40 * d;
        }

        if (d >= 7) {
            result = 40 * d - 50;
            //
        }

        if (d >= 3 && d <= 6) {
            result = 40 * d - 20;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(rentalCarCost(6));
    }


    public static void solveTask() {
        System.out.println("Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.\n"
                + "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        Scanner scanner = new Scanner(System.in);

        int valueNumber = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter count days:");
            String valueString = scanner.next();

            try {
                valueNumber = Integer.parseInt(valueString);
                if (valueNumber > 0) {
                    flag = false;
                } else {
                    System.out.println("Please enter a correct count day!");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }

        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(rentalCarCost(valueNumber));
        System.out.println("-----------");

    }

}
