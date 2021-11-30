package application.tasks.string;

import java.util.*;

public class ReverseString {
    private static String reverse(String str) {
        List<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        String result = "";
        for (String i : list) {
            result += i;
        }

        return result;
    }

    public String getRevers(String str) {
        return reverse(str);
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter some word:\n> ");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("Result: " + reverse(str));
    }
}
