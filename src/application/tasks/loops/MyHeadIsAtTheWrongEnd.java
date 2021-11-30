package application.tasks.loops;

import java.util.Scanner;

public class MyHeadIsAtTheWrongEnd {
    public static String[] fixAnimals(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("body") && i == 0) {
                temp = arr[i];
                arr[i] = "head";
                arr[(i + 1)] = temp;
            } else if (arr[i].equals("tail") && i == 0) {
                temp = arr[i];
                arr[i] = "head";
                arr[(i + 2)] = temp;
            } else if (arr[i].equals("head") && i == 1) {
                temp = arr[i];
                arr[i] = "body";
                arr[(i - 1)] = temp;
            } else if (arr[i].equals("tail") && i == 1) {
                temp = arr[i];
                arr[i] = "tail";
                arr[(i + 1)] = temp;
            } else if (arr[i].equals("head") && i == 2) {
                temp = arr[i];
                arr[i] = "tail";
                arr[(i - 2)] = temp;
            } else if (arr[i].equals("body") && i == 2) {
                temp = arr[i];
                arr[i] = "tail";
                arr[(i - 1)] = temp;
            }
        }
        return arr;
    }

    public static void task(Scanner in) {

        String array[] = new String[3];

        in.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " part of the animal like  \"head\", \"tail\" or \"body\"");
            array[i] = in.nextLine();
        }

        String array1[] = fixAnimals(array);
        System.out.print("Fixed: ");
        for (String part:array1) {
            System.out.print(part+" ");
        }
    }
}
