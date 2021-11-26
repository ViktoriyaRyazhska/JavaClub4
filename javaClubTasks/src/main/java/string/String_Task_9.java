package string;

import java.util.Scanner;

public class String_Task_9 {

    public static String position(char alphabet) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int position = alph.indexOf(alphabet);
        String result = "Position in alphabet: " +(position+1);
        return result;
    }


    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! Everyone knows english alphabet\n" +
                "This task can find a position in alphabet of any english letter:\n" +
                "Please enter single english letter");
        String letter = scanner.next().toLowerCase();
        char ch = letter.charAt(0);

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(position(ch));
        System.out.println("-----------");

    }
}
