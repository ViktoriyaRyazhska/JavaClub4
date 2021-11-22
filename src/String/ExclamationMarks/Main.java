package String.ExclamationMarks;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        final int n = scanner.nextInt();
        scanner.close();

        System.out.println("Removing " + n + "!: " + removeExclamationMarks(str, n));
    }

    public static String removeExclamationMarks(final String str, final int n){
        String newStr = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '!'){
                count++;
                if(count <= n){
                    continue;
                }else{
                    newStr += String.valueOf(str.charAt(i));
                }
            }else{
               newStr += String.valueOf(str.charAt(i));
            }
        }
        return newStr;
    }
}
