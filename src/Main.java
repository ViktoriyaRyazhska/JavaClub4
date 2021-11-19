import java.util.Scanner;
import tasks.basic.Task1;
import tasks.basic.Task2;
import tasks.basic.Task3;
import static org.junit.Assert.assertEquals;
public class Main {

    public static void main(String[] args){

        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Double-Integer");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Clock");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        Scanner scanner = new Scanner( System.in );
        int numOfTask = scanner.nextInt();

        switch (numOfTask) {
            case 1 -> {
                System.out.println("Please enter number to double it: ");
                int numToDouble = scanner.nextInt();
               Task1 task1 = new Task1();
                task1.execute(numToDouble);
            }
            case 2 -> {
                System.out.println("Please enter two numbers to multiply them: ");
                int firstNum = scanner.nextInt();
                int secondNum = scanner.nextInt();
                Task2 task2 = new Task2();
                task2.execute(firstNum, secondNum);
            }
            case 3 -> {
                System.out.println("Please enter length, width and height to get volume of cuboid: ");
                int length = scanner.nextInt();
                int width = scanner.nextInt();
                int height = scanner.nextInt();
                Task3 task3 = new Task3();
                task3.execute(length, width, height);
            }
            case 7 -> {
                System.out.println("Please enter hour, minute and second to get ms: ");
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                Task7 task7 = new Task7();
                assertEquals(task7.execute(h, m, s));
            }
        }


    }
}
