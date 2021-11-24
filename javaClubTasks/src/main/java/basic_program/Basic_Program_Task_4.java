package basic_program;

import string.String_Task_4;

import java.util.Scanner;

public class Basic_Program_Task_4 {

    public static int century(int year) {
        int century;
        int result = year % 100;

        if (result != 0) {
            century = year / 100 + 1;
        } else {
            century = year / 100;
        }
        return century;
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int value = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(century(value));
        System.out.println("-----------");

    }
}
