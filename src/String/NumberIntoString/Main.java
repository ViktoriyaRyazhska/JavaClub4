package String.NumberIntoString;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        scanner.close();

        System.out.println(convertToString(a));
    }

    public static String convertToString(final int num){
        return num + "";
    }
}
