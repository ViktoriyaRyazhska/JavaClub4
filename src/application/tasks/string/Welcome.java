package application.tasks.string;

import java.util.*;

public class Welcome {
    private static List<String> inputName(Scanner scanner) {
        List<String> name = new ArrayList<String>(Arrays.asList(scanner.nextLine().split(" ")));

        return name;
    }

    private static String printHello(List<String> name) {
        String result = "Hello, ";
        for (int i = 0; i < name.size(); i++) {
            result += name.get(i);
            if (i == name.size() - 1) {
                break;
            }
            result += " ";
        }
        result += "!";

        return result;
    }
    private static String welcome(String hello, String city, String state) {
        return hello + " Welcome to " + city + ", " + state + "!";
    }

    public static void task(Scanner scanner) {
        System.out.print("Enter your fullname:\n> ");
        String hello = printHello(inputName(scanner));
        System.out.print("Enter the city:\n> ");
        String city = scanner.nextLine();
        System.out.print("Enter the state:\n> ");
        String state = scanner.nextLine();

        System.out.println(welcome(hello, city, state));
    }
}
