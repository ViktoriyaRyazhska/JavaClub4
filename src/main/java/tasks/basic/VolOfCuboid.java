package tasks.basic;

public class VolOfCuboid {

    public void execute(double length, double width, double height ){

        System.out.println(getVolumeOfCuboid(length, width, height));
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length * width * height;
    }
}
