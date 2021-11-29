package application.tasks.basic;
import java.util.Scanner;

public class ReturnNegative {
    public static void task(Scanner n){
        System.out.println("Enter number");
        int number;
        number = n.nextInt();
        if(number < 0){
            System.out.println("Your negative number is " + number);
        }else if(number > 0){
            number *= -1;
            System.out.println("Your negative number is " + number);
        }else
            System.out.println("Enter the right number");
    }
}
