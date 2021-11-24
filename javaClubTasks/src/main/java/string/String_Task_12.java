package string;

public class String_Task_12 {

    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32) * 5/9;
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println(weatherInfo(23));
        System.out.println(weatherInfo(50));
    }

}
