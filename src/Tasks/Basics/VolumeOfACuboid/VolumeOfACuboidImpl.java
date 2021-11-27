package Tasks.Basics.VolumeOfACuboid;

import java.util.Scanner;

public class VolumeOfACuboidImpl implements VolumeOfACuboid{
    private int length;
    private int width;
    private int height;

    public VolumeOfACuboidImpl(final Scanner scanner) {
        setLength(scanner.nextInt());
        setWidth(scanner.nextInt());
        setHeight(scanner.nextInt());
    }

    public int getLength() {
        return length;
    }

    public void setLength(final int length) {
       this.length = Math.max(length, 1);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = Math.max(width, 1);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = Math.max(height, 1);
    }

    @Override
    public int getVolumeOfCuboid() {
        return getLength() * getWidth() * getHeight();
    }
}
