package application.tasks.basic;

import java.util.Scanner;

public class JennySecretMessage {
    public static String greet(String name) {
        if (name.equals("Johnny") || name.equals("johnny"))
            return "Hello, my love!";
        else
            return String.format("Hello, %s!", name);
    }

    public static void task(Scanner in) {
        System.out.print("Enter your name:\n> ");
        String name = in.nextLine();
        System.out.println(greet(name));
    }
}

