package String.CountOfOccurrences;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String word = scanner.nextLine();
        final char symbol = scanner.next().charAt(0);
        scanner.close();

        System.out.println(countOfOccurrences(word, symbol));
    }

    public static int countOfOccurrences(final String word, final char symbol){
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == symbol){
                count++;
            }
        }
        return count;
    }
}
