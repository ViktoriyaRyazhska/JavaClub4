package application.tasks.conditions;

import java.util.Scanner;

public class LogicDrills {
    public static String task(String current,Scanner in) {
        System.out.println("Enter your light ");
        current = updateLight(in);
        return current;
    }
    public static String updateLight(Scanner in){
        String light = in.nextLine();
        switch (light){
            case "Green":
                return "Yellow";
            case "Yellow":
                return "Red";
            case "Red":
                return "Green";
            default:
                return updateLight(in);
        }
    }
}
