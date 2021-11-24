package string;

import java.util.Scanner;

public class String_Task_17 {

    public static String toAlternativeString(String string) {

        StringBuffer newStr = new StringBuffer(string);

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            } else if (Character.isUpperCase(string.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            }
        }

        String result = String.valueOf(newStr);
        System.out.println("String after case conversion : " + newStr);
        return result;
    }

    public static void main(String[] args) {
        toAlternativeString("StringUtils.toAlternatingCase");
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String value1 = scanner.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(toAlternativeString(value1));
        System.out.println("-----------");

    }
}
