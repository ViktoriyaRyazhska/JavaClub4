package conditions;

import java.util.Scanner;

public class Conditions_task_5 {
    public static String CalculateAge(int birth, int yearTo) {
        int yearsCount = 0 ;
        String result = "";
        if (yearTo < birth) {
            yearsCount = birth - yearTo;
            if (yearsCount > 1) {
                result = "You will be born in " + yearsCount + " years.";
            } else if (yearsCount <= 1) {
                result = "You will be born in " + yearsCount + " year.";
            }
        } else if (birth == yearTo) {
            result = "You were born this very year!";
        } else {
            yearsCount = yearTo - birth;
            if (yearsCount > 1) {
                result = "You are " + yearsCount + " years old.";
            } else if (yearsCount <= 1) {
                result = "You are " + yearsCount + " year old.";
            }
        }
        return result;
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Hello there! This program can tell you how old you will be in the future.\n" +
                "It also works with years in the past");
        System.out.println("Please enter the year of your birth: ");
        int year ;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an year, enter year:");
            scanner.next();
        }
        year = scanner.nextInt();
        System.out.println("Please enter the year to count years in relation to: ");
        int yearTo = 0;
        while (!scanner1.hasNextInt()) {
            System.out.println("That's not an year, enter year:");
            scanner1.next();
        }
        yearTo = scanner1.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(CalculateAge(year,yearTo));
        System.out.println("-----------");

    }
}
