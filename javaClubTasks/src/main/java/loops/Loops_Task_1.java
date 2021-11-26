package loops;

import java.util.Scanner;

public class Loops_Task_1 {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hello there! This program can repeat string that you enter a lot of times.\n" +
                "Please enter count of times that you want to repeat it:  ");
        int count = scanner.nextInt();
        System.out.println("Please enter the string: ");
        String str = scanner1.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(repeatStr(count, str));
        System.out.println("-----------");

    }
}
