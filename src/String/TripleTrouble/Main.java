package String.TripleTrouble;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String a = scanner.nextLine();
        final String b = scanner.nextLine();
        final String c = scanner.nextLine();
        scanner.close();

        System.out.println(combineTriple(a, b, c));
    }

    public static String combineTriple(final String a, final String b, final String c){
        String str = "";
        String tmp = "";
        int size = Math.max(Math.max(a.length(), b.length()), c.length());
        for (int i = 0; i < size; i++){
            tmp = i < a.length() ? String.valueOf(a.charAt(i)) : " ";
            tmp += i < b.length() ? String.valueOf(b.charAt(i)) : " ";
            tmp += i < c.length() ? String.valueOf(c.charAt(i)) : " ";
            str = str.concat(tmp);
        }
        return str;
    }
}
