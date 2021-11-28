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

    public static void solveTask() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hello there! This program can repeat string that you enter a lot of times.\n");
        int count;
        System.out.println("Please enter count of times that you want to repeat it:");
        while (!scanner.hasNextInt() || scanner.hasNext("(-[0-9]+)")) {
            System.out.println("That's not a positive number or number is too big!");
            scanner.next(); // this is important!
        }
        count = scanner.nextInt();

        System.out.println("Please enter the string: ");
        String str = scanner1.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(

                repeatStr(count, str));
        System.out.println("-----------");

    }
}
