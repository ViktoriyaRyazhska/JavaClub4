package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Loops_Task_5 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (present != null && present) {
                counter += 1;
            }
        }
        return counter;
    }


    public static void solveTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! Consider an array/list of sheep where some sheep may be missing from their place.\n" +
                "This program can count present sheep. Present means true in array\n" +
                "Please enter size of array which you want to enter: ");
        int size;
        while (!scanner.hasNextInt() || scanner.hasNext("(-[0-9]+)")) {
            System.out.println("Array size can only be positive integer number. Try again: ");
            scanner.next();
        }
        size = scanner.nextInt();
        Boolean[] array1 = new Boolean[size];
        boolean sheep = false;
        int choise;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) + " member of sheep group" +
                    "\nPress 1 if it is present" +
                    "\nPress 0 if it's not");
            while (!scanner.hasNext("[10]")) {
                System.out.println("You entered something which is not equal to 0 or 1. Try again: ");
                scanner.next();
            }
            choise = scanner.nextInt();
            switch (choise) {
                case 0: {
                    sheep = false;
                    break;
                }
                case 1: {
                    sheep = true;
                    break;
                }
            }
            array1[i] = sheep;
        }

        System.out.println("This is array of sheep that you've entered. Count present by yourself to\n" +
                "Check if program works correctly" + Arrays.toString(array1));
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(countSheeps(array1));
        System.out.println("-----------");

    }
}
