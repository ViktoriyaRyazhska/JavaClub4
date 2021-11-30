package application.tasks.conditions;

import java.util.Scanner;

public class LogicDrills {
    public static void task(Scanner in) {
        System.out.println("Enter your light ");
        String current = in.nextLine();
        updateLight(current);
        System.out.println("Next light is " + updateLight(current));

    }
    public static String updateLight(String current){
        switch (current){
            case "Green":
                return "Yellow";
            case "Yellow":
                return "Red";
            case "Red":
                return "Green";
            default:
                return updateLight(current);
        }
    }
}
