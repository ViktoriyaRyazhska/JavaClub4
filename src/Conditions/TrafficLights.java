package Conditions;

public class TrafficLights {
    public static String updateLight(String current) {
        if (current.equals("green"))
          return "Наступний колір буде: yellow";
        if (current.equals("yellow"))
          return "Наступний колір буде: red";
        if (current.equals("red"))
          return "Наступний колір буде: green";
        return "Ви ввели неправильне значення";
    }
}
