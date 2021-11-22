package Loops.SumOfPositive;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(Arrays.toString(array));

        System.out.println(sumOfPositive(array));
    }

    public static int sumOfPositive(final int[] array){
        if(array.length == 0){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
