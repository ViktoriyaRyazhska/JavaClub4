package loops;

import java.util.Scanner;

public class Loops_Task_5 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (present != null && present) {
                counter += 1;
            }
        }
        return counter;
    }


    public static void solveTask() {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        System.out.println("Hello there! Consider an array/list of sheep where some sheep may be missing from their place.\n" +
                "This program can count present sheep. Present means true in array\n" +
                "Imagine we have an array of sheep like this:\n" +
                "[true,  true,  true,  false,\n" +
                "  true,  true,  true,  true ,\n" +
                "  true,  false, true,  false,\n" +
                "  true,  false, false, true ,\n" +
                "  true,  true,  true,  true ,\n" +
                "  false, false, true,  true]\n" +
                "The correct answer of sheep count is 17\n" +
                "Not let's just call the method which counts it using loop");






        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(countSheeps(array1));
        System.out.println("-----------");

    }
}
