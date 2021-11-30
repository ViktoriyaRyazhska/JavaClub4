package application.tasks.basic;

import java.util.Scanner;

public class JennySecretMessage {
    public static String greet(String name) {
        if (name.toLowerCase().equals("johnny"))
            return "Hello, my love!";
        else
            return String.format("Hello, %s!", name);
    }

    public String getGreet(String name) {
        return greet(name);
    }

    public static void task(Scanner in) {
        System.out.print("Enter your name:\n> ");
        in.nextLine();
        String name = in.nextLine();
        System.out.println(greet(name));
    }
}

