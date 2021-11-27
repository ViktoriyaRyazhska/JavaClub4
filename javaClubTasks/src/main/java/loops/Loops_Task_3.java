package loops;


import java.util.Scanner;

public class Loops_Task_3 {
    public static int getAverage(int[] marks){
        int sum = 0;
        for(int i : marks) sum += i;
        return ((int) sum)/marks.length;
    }
    public static void solveTask(){
        System.out.println("This program calculates averages");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int marks[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            marks[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + marks[i]);
        }
        System.out.println();
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(getAverage(marks));
        System.out.println("-----------");
    }

}
