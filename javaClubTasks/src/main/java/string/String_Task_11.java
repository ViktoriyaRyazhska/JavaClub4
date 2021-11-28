package string;

import java.util.Scanner;

public class String_Task_11 {
    public static int howOld(final String herOld) {
        String s = herOld.substring(0,1);
        return Integer.parseInt(s);

    }
    public static void solveTask(){
        System.out.println("This program makes the first char is number only.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your string:");
        String value1 = scanner1.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(howOld(value1));
        System.out.println("-----------");
    }
}
