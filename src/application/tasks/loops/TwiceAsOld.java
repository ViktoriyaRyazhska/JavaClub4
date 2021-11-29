package application.tasks.loops;

import java.util.Scanner;

public class TwiceAsOld {
    private static boolean isTwice(int dadAge, int sonAge) {
        boolean isTwice = ((dadAge / 2 == sonAge) && (dadAge % 2 == 0));

        return isTwice;
    }

    private static int onHowYears(int dadAge, int sonAge) {
        int years = 0;
        int currDadAge = dadAge;
        if ((dadAge / 2 > sonAge) && (!isTwice(dadAge, sonAge))) {
            while (!isTwice(dadAge, sonAge)) {
                dadAge++;
                sonAge++;
            }
            years = dadAge - currDadAge;
        } else if (dadAge / 2 < sonAge) {
            while (!isTwice(dadAge, sonAge)) {
                dadAge--;
                sonAge--;
            }
            years = dadAge - currDadAge;
        }

        return years;
    }

    private static String output(int years) {
        String result = "Father is twice as old as his son now";
        if (years < 0) {
            result = "Father was twice as old as his son " + (0 - years) + " year(s) ago";
        } else if (years > 0) {
            result = "Father will be twice as old as his son in " + years + " year(s)";
        }

        return result;
    }
    public String  getOutPut(int dadAge, int sonAge){
        return output(onHowYears(dadAge,sonAge));
    }


    private static boolean validate(int dadAge, int sonAge) {
        boolean flag = true;
        if (dadAge <= 0 || dadAge < sonAge || sonAge < 0) {
            flag = false;
        }

        return flag;
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter dad`s age:\n> ");
        int dadAge = scanner.nextInt();
        System.out.print("Enter son`s age:\n> ");
        int sonAge = scanner.nextInt();
        if (validate(dadAge, sonAge)) {
            System.out.println("Result: " + output(onHowYears(dadAge, sonAge)));
        } else {
            System.out.println("Error.. invalid input");
            task(scanner);
        }
    }
}
