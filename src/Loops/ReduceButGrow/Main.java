package Loops.ReduceButGrow;

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

        System.out.println(multiplyingValues(array));
    }

    public static int multiplyingValues(final int[] array){
        if(array.length == 0){
            return 0;
        }

        int product = 1;
        for (int i = 0; i < array.length; i++){
            product *= array[i];
        }
        return product;
    }
}
