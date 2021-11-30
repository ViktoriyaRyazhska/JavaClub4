package Errors;

import java.util.Scanner;

public class NotAString {
    public static String CheckString(Scanner scanner){
        while(scanner.hasNextInt()){
            System.out.print("It's not a word.Type a word!\nWord : ");
            scanner.next();
        }
        return scanner.next();
    }
}
