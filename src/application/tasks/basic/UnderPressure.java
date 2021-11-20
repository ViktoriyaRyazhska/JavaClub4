package application.tasks.basic;

<<<<<<< HEAD
public class UnderPressure {
    public void one() {
        System.out.println("Hello world");
=======
import java.util.Scanner;

public class UnderPressure {
    private static int doubleInteger(int number) {
        return number * 2;
    }

    public static void task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to double: ");
        int number = in.nextInt();
        System.out.println("Result: " + doubleInteger(number));
>>>>>>> refs/remotes/origin/Team5
    }
}
