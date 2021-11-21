package application.tasks.conditions;

import java.util.Scanner;

public class WillBeEnoughSpace {
    private static int enough(int canHold, int onTheBus, int waiting) {
        int left = canHold - onTheBus - waiting;
        if (left >= 0) {
            left = 0;
        }

        return 0 - left;
    }
    private static String output(int waiting, int left) {
        String result = "Can`t fit " + left + " of the " + waiting + " passengers";
        if (left == 0) {
            result = "Can fit all " + waiting + " passengers";
        }

        return result;
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of people the bus can hold:\n> ");
        int canHold = in.nextInt();
        System.out.print("Enter amount of people on the bus:\n> ");
        int onTheBus = in.nextInt();
        System.out.print("Enter amount of waiting people:\n> ");
        int waiting = in.nextInt();
        if (canHold <= 1 || onTheBus < 0 || waiting < 0) {
            System.out.println("Error.. invalid input");
            task();
        } else {
            System.out.println("Result: " + output(waiting, enough(canHold, onTheBus, waiting)));
        }
    }
}