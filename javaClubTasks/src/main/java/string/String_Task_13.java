package string;

import java.util.Locale;
import java.util.Scanner;

public class String_Task_13 {

    public static String abbrevName(String name) {
        String result = "";
        int nameEndingFlag = name.indexOf(' ', 0);
        String fname = name.substring(0, nameEndingFlag);
        String lname = name.substring(nameEndingFlag + 1);
        char fn = fname.charAt(0);
        char surn = lname.charAt(0);
        result = fn + "." + surn;
        return result.toUpperCase();
    }


    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! This task converts your name and surname to abbreviation\n" +
                "Please enter your name and surname:");
        String credentials = scanner.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(abbrevName(credentials));
        System.out.println("-----------");

    }

}
