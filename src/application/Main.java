package application;

import application.tasks.basic.BeginnerSeries;
import application.tasks.basic.UnderPressure;

import java.util.Scanner;

public class Main {
    private static void choice() {
        System.out.print("\nSelect an option: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option) {
            default:
                System.out.println("Sorry.. this option don`t exist");
                break;
            case 0:
                break;
            case 1:
                UnderPressure.task();
                choice();
                break;

        }
    }
    private static String listOfOptions() {
        String listOfOptions =
                "0. Exit\n" +
                "1. Double your number\n" +
                "";

        return listOfOptions;
    }

    public static void main(String[] args) {
        System.out.println(listOfOptions());
        choice();


    }
}
