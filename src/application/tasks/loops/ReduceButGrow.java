package application.tasks.loops;

import java.util.Scanner;

public class ReduceButGrow {
    private static int grow(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }
    public int getGrow(int[] array) {
        return grow(array);
    }

    public static void task(Scanner in) {
        System.out.print("Array size?: ");
        int arraySize = in.nextInt();
        int array[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter " + (i + 1) + " number in the array:");
            array[i] = in.nextInt();
        }
        System.out.println("Total: "+grow(array));
    }
}
