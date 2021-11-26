package Conditions;

public class TrafficLights {
    public static String updateLight(String current) {
        if (current.equals("green"))
          return "yellow";
        if (current.equals("yellow"))
          return "red";
        if (current.equals("red"))
          return "green";
        return "";
    }
}
