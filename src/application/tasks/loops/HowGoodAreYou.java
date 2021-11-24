package application.tasks.loops;

import java.util.Scanner;

public class HowGoodAreYou {
    private static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // calculation of the avr
        int sum = 0;
        int count = 0;
        for (int result : classPoints) {
            sum += result;
            count++;
        }

        int avr = sum / count;

        //Better than avr?
        if (avr < yourPoints)
            return true;
        else
            return false;
    }

    public static void task(Scanner in) {
        System.out.print("Array size?: ");
        int arraySize = in.nextInt();
        int array[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter " + (i + 1) + " test result:");
            // array[result] = Integer.valueOf(in.nextLine());
            array[i] = in.nextInt();
        }
        System.out.println("Enter your score: ");
        int yourScore = in.nextInt();

        System.out.println(betterThanAverage(array, yourScore));
    }
}
