package String.Banjo;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Are you playing banjo?");

        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.nextLine();
        scanner.close();

        System.out.println(playingBanjo(name));
    }

    public static String playingBanjo(final String name){
        String answer = "";
        if(name.charAt(0) == 'R' || name.charAt(0) == 'r'){
            return answer = name + " plays banjo";
        }else{
            return answer = name + " does not play banjo";
        }
    }
}
