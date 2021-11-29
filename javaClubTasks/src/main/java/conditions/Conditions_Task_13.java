package conditions;

import java.util.Scanner;

public class Conditions_Task_13 {
    public static String updateLight(String current) {
        switch(current){
            case "green": return "yellow";
            case "yellow": return "red";
            case "red" : return"green";

        } return " ";

    }
    public static void solveTask(){
        System.out.println("This program controls your town's traffic lights");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please, enter current state of the light:");
        String value1;
        while (!scanner1.hasNextLine()) {
            System.out.println("That's not an string, enter string:");
            scanner1.next();
        }
        value1 = scanner1.nextLine();

        System.out.println("Result: ");
        System.out.println("-----------");
        System.out.println(updateLight(value1));
        System.out.println("-----------");
    }
}
