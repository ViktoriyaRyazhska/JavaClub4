package string;

import java.util.Scanner;

public class String_Task_2 {
    public static String solution(String str) {
        char [] arr = str.toCharArray();
        String newstr = "";
        int counter = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            newstr+= arr[counter];
            counter--;
        }
        return newstr;
    }
    public static void solveTask(){
        System.out.println("This program reverses the string you input.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String value1 = scanner.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(solution(value1));
        System.out.println("-----------");
    }
}
