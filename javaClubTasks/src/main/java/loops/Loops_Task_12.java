package loops;

import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Loops_Task_12 {

    public static int nearestSq(int n) {
        int base = (int) Math.round(Math.sqrt(n));
        return base * base;
    }

    public static void main(String args[]) {

        System.out.println(nearestSq(9999));

    }

    public static void solveTask() {
        System.out.println("This method find the nearest square number, nearest_sq(n), of a positive integer n.");
        Scanner scanner = new Scanner(System.in);

        int valueNumber = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter number:");
            String valueString = scanner.next();

            try {
                valueNumber = Integer.parseInt(valueString);
                if (valueNumber > 0) {
                    flag = false;
                } else {
                    System.out.println("The value cannot be less than 1");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }

        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(nearestSq(valueNumber));
        System.out.println("-----------");

    }

}
