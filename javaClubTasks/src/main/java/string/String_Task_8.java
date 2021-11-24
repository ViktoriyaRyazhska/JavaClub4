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

    public void info(){
        System.out.println("task 2");
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("aa", "bb", "cc"));
    }

    public static void solveTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word:");
        String value1 = scanner.next();
        System.out.println("Enter second word:");
        String value2 = scanner.next();
        System.out.println("Enter third word:");
        String value3 = scanner.next();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(tripleTrouble(value1, value2, value3));
        System.out.println("-----------");

    }

}





