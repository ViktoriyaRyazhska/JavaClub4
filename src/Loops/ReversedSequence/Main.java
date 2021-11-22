package Loops.ReversedSequence;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1) {
            do {
                System.out.println("n must be >= 1! Please, enter the right number: ");
                n = scanner.nextInt();
            } while (n < 1);
        }
        scanner.close();

        System.out.println(Arrays.toString(reversedSequence(n)));
    }

    public static int[] reversedSequence(final int n) {
        int[] sequence = new int[n];
        for (int i = n; i > 0; i--) {
            sequence[n - i] = i;
        }
        return sequence;
    }
}
