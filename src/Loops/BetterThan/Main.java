package Loops.BetterThan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] array = new int[n + 1];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Please, enter your point: ");
        array[n] = scanner.nextInt();
        scanner.close();

        System.out.println(Arrays.toString(array));

        System.out.println(betterThatAverage(array));
    }

    public static boolean betterThatAverage(final int[] array){
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++){
            sum += array[i];
        }
        final double average = 1.0 * sum/(array.length - 1);
        return average < array[array.length - 1];
    }
}
