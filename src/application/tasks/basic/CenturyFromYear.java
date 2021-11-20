package application.tasks.basic;
import java.util.Scanner;

public class CenturyFromYear {
    private static void task(){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter year");
        int year;
        year = y.nextInt();
        if(year % 10 != 0){
            year = (year / 100) + 1;
            System.out.println("Your century is " + year + "th");
        }else if (year % 10 == 0) {
             year = year / 100;
            System.out.println("Your century is " + year + "th");
        }else
            System.out.println("Enter year again");
    }
}
