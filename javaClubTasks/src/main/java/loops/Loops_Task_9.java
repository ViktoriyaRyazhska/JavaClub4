package loops;

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
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Please enter the " +i+ " element of the array" );
            int str = scanner1.nextInt();
            arr[i] = str;
        }


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(sum(arr));
        System.out.println("-----------");

    }
}
