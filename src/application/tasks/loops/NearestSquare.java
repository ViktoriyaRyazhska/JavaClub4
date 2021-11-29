package application.tasks.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NearestSquare {
    private static double whichWay(int n) { // Якщо < 0, то віднімати. Якщо > 0, то додавати
        double difference = Math.round(Math.sqrt(n)) - Math.sqrt(n);

        return difference;
    }

    private static int findSquareNumber(int n) {
        int expectedNumber = n;

        while (whichWay(expectedNumber) != 0) {
            if (whichWay(n) < 0) {
                expectedNumber--;
            } else if (whichWay(n) > 0) {
                expectedNumber++;
            }
        }

        return expectedNumber;
    }
    public int getFindSquareNumber(int n){
        return findSquareNumber(n);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter the number to find nearest square number:\n> ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Error.. invalid input");
            task(scanner);
        } else {
            System.out.println("Result: " + findSquareNumber(n));
        }
    }
}
