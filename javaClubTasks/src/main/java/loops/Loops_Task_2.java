package loops;

import java.util.Scanner;

public class Loops_Task_2 {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        int dogYears = 15;
        if(humanYears == 2) {
            return new int[] {humanYears,catYears + 9,dogYears + 9};
        }
        if(humanYears > 2) {
            for (int i = 0; i < humanYears -2; i++) {
                catYears += 4;
                dogYears += 5;
            }
            return new int[] {humanYears,catYears + 9,dogYears + 9};
        }
        return new int[]{humanYears,catYears,dogYears};
    }
    public static void solveTask(){
        System.out.println("This program takes one integer parameter(human yers) and\n" +
                " converts it into the cat years and dog years");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter human years : ");
        int value1;
        while (!scanner.hasNextInt() || scanner.hasNext("(-[100000-1]+)")) {
            System.out.println("That's not an integer or it is less than 0, enter integer type:");
            scanner.next();
        }
        value1 = scanner.nextInt();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println("Cat years : " + Loops_Task_2.humanYearsCatYearsDogYears(value1)[1]);
        System.out.println("Dog years : " + Loops_Task_2.humanYearsCatYearsDogYears(value1)[2]);
        System.out.println("-----------");

    }
}
