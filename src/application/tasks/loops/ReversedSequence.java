package application.tasks.loops;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedSequence {
    private static int[] reverse(int n) {
        //original array
        int array[] = new int[n];
        for (int i = n; i > 0; i--) {
            array[i - 1] = i;
        }
        //reverse array
        int array1[] = new int[n];
        int max = n - 1;
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[max];
            max--;
        }
        return array1;
    }

    public static void task(Scanner in) {
        System.out.println("Enter number to start with: ");
        int n = in.nextInt();
        System.out.println(Arrays.toString(reverse(n)));
    }

    public static void main(String[] args) {
       int n = (5<<3);
        System.out.println(n);


        int  r = 5/2;
        System.out.println(r);
    }
}
