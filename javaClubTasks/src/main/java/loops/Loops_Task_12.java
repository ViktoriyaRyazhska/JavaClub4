package loops;

import java.util.Scanner;

public class Loops_Task_12 {

    public static int nearestSq(int n) {
        int base = (int) Math.round(Math.sqrt(n));
        return base * base;
    }

    public static void main(String args[]) {

        System.out.println(nearestSq(9999));

    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int value1 = scanner.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(nearestSq(value1));
        System.out.println("-----------");

    }
}
