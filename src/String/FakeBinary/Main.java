package String.FakeBinary;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String digits = String.valueOf(scanner.nextInt());
        scanner.close();

        System.out.println(replaceDigits(digits));
    }

    public static String replaceDigits(final String digits){
        String str = digits;
        str = str.replaceAll("[1-5]", "0");
        str = str.replaceAll("[6-9]", "1");
        return str;
    }
}
