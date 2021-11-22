package Loops.ArrayMean;

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

        System.out.println(averageOfArray(array));
    }

    public static int averageOfArray(final int[] array) {
        int sum = 0;
        if(array.length == 0){
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        final double average = 1.0 * sum / array.length;
        final double fraction = average % 1;

        return fraction < 0.5 ? (int) average : (int) average + 1;
    }
}
