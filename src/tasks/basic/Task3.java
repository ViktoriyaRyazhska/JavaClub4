package tasks.basic;

public class Task3 {

    public void execute(double length, double width, double height ){

        System.out.println(getVolumeOfCuboid(length, width, height));
    }

    private static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length * width * height;
    }
}
