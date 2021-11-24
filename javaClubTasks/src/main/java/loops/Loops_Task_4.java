package loops;

import java.util.Scanner;

public class Loops_Task_4 {
    public static int[] map(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result[index++] = arr[i] + 1;
            } else {
                result[index++] = arr[i] * 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = {1, 2, 3};
        map(result);
    }


    public static void solveTask(){
        int[] result = {1, 2, 3};
        System.out.println("Array = {1,2,3}");


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(map(result));
        System.out.println("-----------");

    }
}
