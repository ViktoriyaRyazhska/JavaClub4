package string;

import java.util.Scanner;

public class String_Task_3 {
    public static String sayHello(String name, String city, String state){

        return String.format("Hello, %s! Welcome to %s, %s!", name, city,state);
    }
    public static void solveTask(){
        System.out.println("This program creates a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        String value1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your city:");
        String value2 = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your state:");
        String value3 = scanner3.nextLine();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(sayHello(value1,value2,value3));
        System.out.println("-----------");
    }
}
