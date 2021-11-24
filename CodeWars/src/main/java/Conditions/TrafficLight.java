package Conditions;

public class TrafficLight {
    public static String updateLight(String current) {

        return current.equals("green")?"yellow":
                current.equals("yellow")?"red":
                        current.equals("red")?"green":"Error";
    }
}

