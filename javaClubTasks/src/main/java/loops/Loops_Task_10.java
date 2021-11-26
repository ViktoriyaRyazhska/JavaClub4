package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Loops_Task_10 {
    public static String[] fixTheMeerkat(String[] arr) {
        return new String[] {arr[2], arr[1], arr[0]};
    }
    public static void solveTask(){
        System.out.println("You will be given an array which will have three values (tail, body, head). This program " +
                "re-arranges the array so that the animal is the right way round (head, body, tail).");
        String [] arr = {"tail", "body", "head"};

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println("Start array : " + Arrays.toString(arr));
        System.out.println("Valid array : " + Arrays.toString(fixTheMeerkat(arr)));
        System.out.println("-----------");

    }
}
