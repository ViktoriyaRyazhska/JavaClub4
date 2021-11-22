package String.ReversedString;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        scanner.close();

        System.out.println(toReverseString(str));
    }

    public static String toReverseString(final String str){
        String revStr = "";
        final char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i > -1; i--) {
            revStr = revStr.concat(String.valueOf(ch[i]));
        }
        return revStr;
    }
}
