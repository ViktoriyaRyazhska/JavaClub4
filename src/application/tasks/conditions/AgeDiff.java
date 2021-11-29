package application.tasks.conditions;

import java.util.Scanner;

public class AgeDiff {
    public static String calculateAge(int birth, int yearTo) {
        int count;

        if (yearTo == birth)
            return "You were born this very year!";
        if (birth < 2021) {
            count = yearTo - birth;
            return String.format("You are %s year(s) old", count);
        } else if (birth > 2021) {
            count = yearTo - birth;
            return String.format("You will be born in %s and in %s you will be %s year(s) old", birth, yearTo, count);
        } else
            return "Something went wrong:(";
    }

    public String getCalculateAge(int birth, int yearTo) {
        return calculateAge(birth, yearTo);
    }

    public static void task(Scanner in) {
        System.out.print("Enter your date of birth:\n> ");
        int birth = in.nextInt();
        System.out.print("Enter the year to count years in relation to:\n> ");
        int yearTo = in.nextInt();
        System.out.println(calculateAge(birth, yearTo));
    }
}
