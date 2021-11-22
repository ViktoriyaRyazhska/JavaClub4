package String.ReplaceDots;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        scanner.close();

        System.out.println(replaceDotsWithDashes(str));
    }

    public static String replaceDotsWithDashes(final String str){
        return str.replaceAll("\\.", "-");
    }
}
