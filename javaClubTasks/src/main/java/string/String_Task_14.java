package string;

import java.util.Scanner;

public class String_Task_14 {
    public static int strCount(String str, char letter) {
        str.toLowerCase();
        int counter = 0;
        char [] arr = str.toCharArray();
        if(str.length() == 0) {
            return 0;
        }else for (int i = 0; i < arr.length; i++) {
            if(arr[i] == letter) {
                counter++;
            }
        }
        return counter;
    }
    public static void solveTask(){
        System.out.println("This program accepts 2 string arguments and returns an integer\n " +
                "of the count of occurrences the 2nd argument is found in the first one.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word :");
        String value1 = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your letter :");
        String value2 = scanner1.next();
        char value3 = value2.toCharArray()[0];


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(strCount(value1,value3));
        System.out.println("-----------");
    }
}
