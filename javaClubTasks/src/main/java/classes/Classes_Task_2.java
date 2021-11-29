package classes;

import java.util.Scanner;

public class Classes_Task_2 {
    private static int ONE_HUNDRED = 100;

    public static final Classes_Task_2 INST = new Classes_Task_2();

    private final int value;

    private Classes_Task_2() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
    public static void main(String[] args) {
        System.out.println();
    }

    public static void solveTask(){
        System.out.println("This program takes one integer parameter and increases the number by 100");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int value1;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer, enter integer type:");
            scanner.next();
        }
        value1 = scanner.nextInt();


        System.out.println("So, now it will return increased number\nResult: ");
        System.out.println("-----------");
        System.out.println(Classes_Task_2.INST.plus100(value1));
        System.out.println("-----------");

    }
}
