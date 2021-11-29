package Basic;

public class CelsiusConverter {

    public static void weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            System.out.println(c + " is freezing temperature");
        else
            System.out.println(c + " is above freezing temperature");
    }

    private static double convertToCelsius(int temperature) {
        return (temperature - 32) * 5 / 9.0;
    }

}