package basic_program;

import java.sql.SQLOutput;
import java.util.Scanner;

import static main.MenuImpl.chooseMenu;

public class Basic_Program_Task_8 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        int result = wallLength % pixelSize;

        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(2045, 5));

    }

    public static void solveTask() {
        System.out.println("This method should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters. \n " +
                "It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False");
        Scanner scanner = new Scanner(System.in);

        int valueIsNumers = 0;
        int valueIsNumers2 = 0;
        boolean flag1 = true;
        boolean flag2 = true;

        while (flag1) {
            System.out.println("Enter the wallLength:");
            String valueString = scanner.next();

            try {
                valueIsNumers = Integer.parseInt(valueString);
                flag1 = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }
        }

        while (flag2) {
            System.out.println("Enter the pixelSize:");
            String valueString = scanner.next();

            try {
                valueIsNumers2 = Integer.parseInt(valueString);
                flag2 = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect Data, please enter a number!");
            }

        }

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(isDivisible(valueIsNumers, valueIsNumers2));
        System.out.println("-----------");

    }

}
