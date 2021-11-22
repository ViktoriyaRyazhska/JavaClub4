package String.Hello;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final String[] str = new String[n];

        for (int i = 0; i < n; i++){
            str[i] = scanner.nextLine();
        }

        final String city = scanner.nextLine();
        final String state = scanner.nextLine();
        scanner.close();

        System.out.println(sayHello(str, city, state));
    }

    public static String sayHello(final String[] name, final String city, final String state){
        String hello = "";
        hello = hello.concat("Hello,");
        for (final String str : name) {
            hello = hello.concat(" " + str);
        }
        hello = hello.concat(" Welcome to " + city + ", " + state + "!");
        return hello;
    }
}
