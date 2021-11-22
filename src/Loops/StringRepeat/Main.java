package Loops.StringRepeat;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        final int n = scanner.nextInt();
        scanner.close();

        toRepeatString(str, n);
    }

    public static void toRepeatString(final String str,final int n){
        if(!str.equals("")) {
            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
        }else{
            System.out.println("String is empty");
        }
    }
}
