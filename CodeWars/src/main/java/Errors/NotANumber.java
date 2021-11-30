package Errors;

import java.util.Scanner;

public class NotANumber {
    public static int CheckInt(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.print("It's not a number.Type a number!\nNumber : ");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
