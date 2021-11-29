package application.tasks.conditions;

import java.util.Scanner;

public class DoIGetBonus {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus == true)
            return String.valueOf(salary * 10);
        else
            return String.valueOf(salary);
    }

    public String getBonusTime(final int salary, final boolean bonus) {
        return bonusTime(salary, bonus);
    }

    public static void task(Scanner in) {
        System.out.print("Enter your salary:\n> ");
        int salary = in.nextInt();
        System.out.print("Do you have bonus?(true or false)\n> ");
        boolean bonus = in.nextBoolean();
        System.out.println("Your total income is $" + bonusTime(salary, bonus));
    }
}
