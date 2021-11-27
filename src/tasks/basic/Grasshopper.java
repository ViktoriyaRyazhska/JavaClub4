package tasks.basic;

public class Grasshopper {

    private static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    private static int convertToCelsius(int temperature) {
        double a = (temperature - 32);
        double b = 5.0 / 9.0;
        return (int) ((int) a * b);
    }

    public void execute(int temp){
        System.out.println(weatherInfo(temp));
    }
}
