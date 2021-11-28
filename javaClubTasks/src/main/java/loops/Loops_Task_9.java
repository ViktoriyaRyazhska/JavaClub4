package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Loops_Task_9 {

    public static int sum(int[] arr) {
        int sumOfPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumOfPositive += arr[i];
            }
        }
        if (sumOfPositive > 0) {
            return sumOfPositive;
        }
        return 0;
    }

    public static void solveTask() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hello there! This program can calculate sum of positive numbers in array.\n" +
                "Please enter array size:  ");
        int size ;
        while (!scanner.hasNextInt() || scanner.hasNext("(-[0-9]+)")) {
            System.out.println("Array size can only be positive integer number. Try again: ");
            scanner.next();
        }
        size = scanner.nextInt();
        int [] arr = new int[size];
        int str ;
        for (int i = 0; i < size; i++){
            System.out.println("Please enter the " +(i+1)+ " element of the array" );
            while (!scanner.hasNextInt()) {
                System.out.println("That's not an integer, enter integer type:");
                scanner.next();
            }
            str = scanner.nextInt();
            arr[i] = str;
        }


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println("This is your array of integer numbers"+ Arrays.toString(arr)+"\n" +
                "Now program will count sum of positive numbers\n" +
                "Result:\n");
        System.out.println(sum(arr));
        System.out.println("-----------");

    }
}
