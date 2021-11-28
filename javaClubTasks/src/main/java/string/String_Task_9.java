package string;

import java.util.Scanner;

public class String_Task_9 {

    public static String position(char alphabet) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int position = alph.indexOf(alphabet);
        String result = "Position of alphabet: " +(position+1);
        return result;
    }


    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! Everyone knows english alphabet\n" +
                "This task can find a position in alphabet of any english letter:\n" +
                "Please enter single english letter");
        String letter ;
        while (!scanner.hasNext("[A-Za-z]")) {
            System.out.println("There is no such letter in english alphabet. Please try again:");
            scanner.next();
        }
        letter = scanner.next().toLowerCase();
        char ch = letter.charAt(0);


        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(position(ch));
        System.out.println("-----------");

    }
}
