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

    public boolean getBetterThanAverage(int[] classPoints, int yourPoints) {
        return betterThanAverage(classPoints, yourPoints);
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

        if (betterThanAverage(array, yourScore))
            System.out.println("Your score is above the average");
        else
            System.out.println("Your score is below of equals the average");
    }
}
