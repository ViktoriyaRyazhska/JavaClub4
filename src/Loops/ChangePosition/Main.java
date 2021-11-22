package Loops.ChangePosition;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final String[] array = new String[3];

        System.out.println(Arrays.toString(createArray(array)));
    }

    public static String[] createArray(final String[] array) {
        for (int i = 0; i < 3; i++) {
            String partOfBody = enterValue();
            for (int j = 0; j < i; j++) {
                while (partOfBody.equals(array[j])) {
                    System.out.println("Please enter another part of the body:");
                    partOfBody = enterValue();
                }
            }
            array[i] = partOfBody;
        }
        return array;
    }

    public static String enterValue() {
        System.out.println("Enter the part of body: ");
        final Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        if (!(value.equals("head") || value.equals("body") || value.equals("tail"))) {
            do {
                System.out.println("Wrong value");
                value = scanner.nextLine();
            } while (!(value.equals("head") || value.equals("body") || value.equals("tail")));
        }
        return value;
    }
//
//    public static String[] sorting(final String[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (!(array[0].equals("head"))) {
//                for (int j = i; j < array.length; j++) {
//                    String tmp = array[0];
//                    if()
//                    array[0] =
//                }
//            }
//        }
//    }
}
