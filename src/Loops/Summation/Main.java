package Loops.Summation;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1) {
            do {
                System.out.println("Number must be >= 1! Please, enter the right number: ");
                n = scanner.nextInt();
            } while (n < 1);
        }
        System.out.println(summation(n));
    }

    public static int summation(final int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++){
            sum += i;
        }
        return sum;
    }
}
