package String.TwoWordName;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.nextLine();
        scanner.close();

        System.out.println(convertNameToInitials(name));
    }

    public static String convertNameToInitials(final String name) {
        String initials = "";
        initials = String.valueOf(name.charAt(0)).toUpperCase() + "." +  String.valueOf(name.charAt(name.indexOf(" ") + 1)).toUpperCase();
        return initials;
    }
}
