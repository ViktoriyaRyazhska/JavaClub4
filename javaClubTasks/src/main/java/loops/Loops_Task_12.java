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
        System.out.println("Enter number:");
        String value1 = scanner.next();
        int valueIsNumers = isNumeric(value1);

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(nearestSq(valueIsNumers));
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
