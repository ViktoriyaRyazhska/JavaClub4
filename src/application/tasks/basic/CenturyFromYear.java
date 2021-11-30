package application.tasks.basic;
import java.util.Scanner;

public class CenturyFromYear {
    public static void task(Scanner scanner) {
        System.out.println("Enter your year");
        int years = scanner.nextInt();
        getCentury(years);
    }
        public static int getCentury(int years){
            if (years % 10 != 0) {
                years = (years / 100) + 1;
                System.out.println("Your century is " + years + "th");
                return years;
            } else if (years % 10 == 0) {
                years = years / 100;
                System.out.println("Your century is " + years + "th");
                return years;
            } else {
                System.out.println("Enter year again");
            }
                CenturyFromYear.getCentury(years);
            return years;

    }
}
