package tasks.basic;

public class Grasshopper {

    private static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    private static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (5.0/9.0);
        return celsius;
    }
    public void execute(int temp){
        System.out.println(weatherInfo(temp));
    }
}
