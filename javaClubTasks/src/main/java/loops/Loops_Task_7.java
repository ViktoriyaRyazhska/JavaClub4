package loops;

import java.util.Scanner;

public class Loops_Task_7 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int val : classPoints) {
            sum += val;
        }
        return yourPoints > (sum / classPoints.length);
    }
    public static void solveTask(){
        System.out.println("This program  informs you to know if you're better than the average student in your class");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your points : ");
        int yourPoints = scanner.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int classPoints[] = new int[size];
        System.out.println("Enter class points:");
        for (int i = 0; i < size; i++) {
            classPoints[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + classPoints[i]);
        }
        System.out.println();
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(betterThanAverage(classPoints,yourPoints));
        System.out.println("-----------");
    }
}
