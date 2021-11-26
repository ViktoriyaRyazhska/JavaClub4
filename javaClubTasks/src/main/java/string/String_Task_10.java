package string;

import java.util.Scanner;

public class String_Task_10 {
    public static String fakeBin(String numberString) {
        char [] arr = numberString.toCharArray();
        String newstr = "";
        int counter = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            char key = arr[i];
            switch (key) {
                case '0':
                    newstr+=0;
                    break;
                case '1':
                    newstr+=0;
                    break;
                case '2':
                    newstr+=0;
                    break;
                case '3':
                    newstr+=0;
                    break;
                case '4':
                    newstr+=0;
                    break;
                case '5':
                    newstr+=1;
                    break;
                case '6':
                    newstr+=1;
                    break;
                case '7':
                    newstr+=1;
                    break;
                case '8':
                    newstr+=1;
                    break;
                case '9':
                    newstr+=1;
                    break;
            }
        }
        return newstr;
    }
    public static void solveTask(){
        System.out.println("This program replaces any digit below 5 with '0' and any digit 5 and above with '1'.\n " +
                "Returns the resulting string.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String value1 = scanner.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(fakeBin(value1));
        System.out.println("-----------");
    }
}
