package String.Position;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final String bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String smallLetters = "abcdefghijklmnopqrstuvwxyz";

        final Scanner scanner = new Scanner(System.in);
        final char letter = scanner.next().charAt(0);
        scanner.close();

        System.out.println("Position of the letter in alphabet is: " + findPosition(letter, bigLetters, smallLetters));
    }

    public static int findPosition(final char symbol, final String upperCase, final String lowerCase){
        int size = upperCase.length();
        for (int i = 0; i < size; i++){
            if(upperCase.charAt(i) == symbol || lowerCase.charAt(i) == symbol){
                return i + 1;
            }
        }
        return -1;
    }
}
