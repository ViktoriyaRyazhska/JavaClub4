package Loops.DoubledArray;

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

        System.out.println(Arrays.toString(doubleArray(array)));
    }

    public static int[] doubleArray(final int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] *= 2;
        }
        return array;
    }
}
