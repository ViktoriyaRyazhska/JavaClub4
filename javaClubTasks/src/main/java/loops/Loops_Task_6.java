package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Loops_Task_6 {
    public static int[] reverse(int n){
        int [] arr = new int[n];
        int lenght = n;
        for (int i = 0; i < lenght; i++) {
            arr[i] = n;
            n--;
        }
        return arr;
    }
    public static void solveTask(){
        System.out.println("This program returns an array of integers from n to 1 where n>0.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        int value1 = scanner.nextInt();


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(Arrays.toString(reverse(value1)));
        System.out.println("-----------");

    }
}
