package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_Task_15 {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
    public static void solveTask(){
        System.out.println("This program  returns value, and have \"***\" between each of its letters");


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your word:");
        String value1 = scanner1.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(twoSort(new String[]{value1}));
        System.out.println("-----------");
    }
}
