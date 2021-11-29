package string;

import java.util.Scanner;

public class String_Task_18 {
    public static String remove(String s, int n){
        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 = s.replaceFirst("!", "");
            s = s1;
        }
        return s1;
    }
    public static void solveTask(){
        System.out.println("This program Remove n exclamation marks in the sentence\n " +
                "from left to right. n must be a positive integer!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string :");
        String value1 = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number of '!' you want to delete :");
        int value2;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        value2 = scanner1.nextInt();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(remove(value1,value2));
        System.out.println("-----------");
    }
}
