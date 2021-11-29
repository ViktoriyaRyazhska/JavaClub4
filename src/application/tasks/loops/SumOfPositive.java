package application.tasks.loops;

import java.util.Scanner;

public class SumOfPositive {
    private static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (n > 0)
                sum += n;
            else if (n < 0)
                continue;
            else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
    public int getSum(int[] arr){
        return sum(arr);
    }

    public static void task(Scanner in){
        System.out.print("Array size?: ");
        int arraySize = in.nextInt();
        int array[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter " + (i + 1) + " positive of negative number");
            array[i] = in.nextInt();
        }
        System.out.println(sum(array));
    }
}
