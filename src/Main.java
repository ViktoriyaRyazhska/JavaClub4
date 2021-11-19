import tasks.Task1;
import tasks.Task2;
import tasks.Task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Double-Integer");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
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
        }


    }
}
