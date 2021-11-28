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

//    public static void solveTask() {
//        System.out.println("This method convert text 'altERnaTIng cAsE <=> ALTerNAtiNG CaSe' ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter expression:");
//        String value1 = scanner.nextLine();
//
//        System.out.println("Result: ");
//        System.out.println("-----------");
//        System.out.println(toAlternativeString(value1));
//        System.out.println("-----------");
//
//    }

    public static void solveTask() {
        System.out.println("This method convert text, for example =  'altERnaTIng cAsE <=> ALTerNAtiNG CaSe' ");
        Scanner scanner = new Scanner(System.in);



        int valueIsNumers = 0;
        String val1 = "";
        boolean flag1 = true;


        while (flag1) {
            System.out.println("Enter expression:");
            String valueString = scanner.nextLine();
            try {
                valueIsNumers = Integer.parseInt(valueString);
                if (valueIsNumers >= 0 || valueIsNumers <= 0) {
                    System.out.println("Please enter a expresion");
                }
            } catch (NumberFormatException nfe) {
                val1 = valueString;
                flag1 = false;
            }
        }


        System.out.println("Result: ");
        System.out.println("-----------");
        toAlternativeString(val1);
        System.out.println("-----------");
    }
}
