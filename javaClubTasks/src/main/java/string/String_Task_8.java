package string;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class String_Task_8 {

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            char first = one.charAt(i);
            result += first;
            char second = two.charAt(i);
            result += second;
            char third = three.charAt(i);
            result += third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("aa", "bb", "cc"));
    }


    public static void solveTask() {
        System.out.println("This method will return a string that combines all of the letters of the three inputed strings in groups. \n " +
                "Taking the first letter of all of the inputs and grouping them next to each other");
        Scanner scanner = new Scanner(System.in);

        int valueIsNumers = 0;
        int valueIsNumers2 = 0;
        int valueIsNumers3 = 0;
        String val1 = "";
        String val2 = "";
        String val3 = "";
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;

        while (flag1) {
            System.out.println("Enter first word:");
            String valueString = scanner.next();
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

        while (flag2) {
            System.out.println("Enter second word:");
            String valueString = scanner.next();
            try {
                valueIsNumers2 = Integer.parseInt(valueString);
                if (valueIsNumers2 >= 0 || valueIsNumers2 <= 0) {
                    System.out.println("Please enter a expresion");
                }
            } catch (NumberFormatException nfe) {
                val2 = valueString;
                flag2 = false;
            }
        }

        while (flag3) {
            System.out.println("Enter third word:");
            String valueString = scanner.next();
            try {
                valueIsNumers3 = Integer.parseInt(valueString);
                if (valueIsNumers3 >= 0 || valueIsNumers3 <= 0) {
                    System.out.println("Please enter a expresion");
                }
            } catch (NumberFormatException nfe) {
                val3 = valueString;
                flag3 = false;
            }
        }
        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(tripleTrouble(val1, val2, val3));
        System.out.println("-----------");
    }

}





