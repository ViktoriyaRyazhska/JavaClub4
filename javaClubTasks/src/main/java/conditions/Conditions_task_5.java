package conditions;

import java.util.Scanner;

public class Conditions_task_5 {
    public static String CalculateAge(int birth, int yearTo) {
        String result = "";
        if (yearTo < birth) {
            yearTo = birth - yearTo;
            if (yearTo > 1) {
                result = "You will be born in " + yearTo + " years.";
            } else if (yearTo <= 1) {
                result = "You will be born in " + yearTo + " year.";
            }
        } else if (birth == yearTo) {
            result = "You were born this very year!";
        } else {
            yearTo = yearTo - birth;
            if (yearTo > 1) {
                result = "You are " + yearTo + " years old.";
            } else if (yearTo <= 1) {
                result = "You are " + yearTo + " year old.";
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
        int year = scanner.nextInt();
        System.out.println("Please enter the year to count years in relation to: ");
        int yearTo = scanner1.nextInt();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(CalculateAge(year,yearTo));
        System.out.println("-----------");

    }
}
