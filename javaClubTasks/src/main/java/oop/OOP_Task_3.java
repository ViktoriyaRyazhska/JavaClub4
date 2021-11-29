package oop;

import java.util.Scanner;

public class OOP_Task_3 extends Encoder {

    public static String encode(String source) {
        if (source == null || source == "") {
            return "";
        }

        source = source.replaceAll("(?i)a", "4");
        source = source.replaceAll("(?i)e", "3");
        source = source.replaceAll("(?i)l", "1");
        source = source.replaceAll("(?i)m", "/^^\\\\");
        source = source.replaceAll("(?i)o", "0");
        source = source.replaceAll("(?i)u", "(_)");

        return source;
    }


    public  static void solveTask() {
        System.out.println("This program provides some way to encode a string into its leetspeak version.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your letter:");
        String value1;

        while (!scanner1.hasNext("[a-z]")) {
            System.out.println("That's not an string, enter string type:");
            scanner1.next();
        }
        value1 = scanner1.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(encode(value1));
        System.out.println("-----------");
    }
}

abstract class Encoder {
    public static String encode(String source) {
        return null;
    }
}



