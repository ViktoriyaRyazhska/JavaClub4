package main;

import basic_program.Basic_Program_Task_4;
import string.String_Task_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // загальний список меню
        System.out.println("Виберіть метод:");
        System.out.println("1 : Метод котрий повертає мінусове значення ");
        System.out.println("0 : вийти ");
        System.out.println("Введіть номер завдання");


        int num = scanner.nextInt();
        switch (num) {
            case 4:
                Basic_Program_Task_4.solveTask();
                break;

            case 8:
                System.out.println("завдання 2");

                break;
            case 3:
                System.out.println("завдання 3");

                break;

            case 0:
                System.exit(0);
                break;
        }
    }
}
