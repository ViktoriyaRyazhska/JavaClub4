package string;

import java.util.Scanner;

public class String_Task_6 {
    public static String areYouPlayingBanjo(String name) {
        char [] arr = name.toCharArray();
        if(arr[0] == 'R' || arr[0] == 'r') {
            return name + " plays banjo";
        }else return name + " does not play banjo";
    }
    public static void solveTask(){
        System.out.println("This program  answers the question 'Are you playing banjo?'.\n" +
                "If your name starts with the letter 'R' or lower case 'r', you are playing banjo!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String value1;
        value1 = scanner.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(areYouPlayingBanjo(value1));
        System.out.println("-----------");
    }
}
