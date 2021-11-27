package Tasks.Basics.ThinkfulNumber;

import java.util.Scanner;

public class ThinkfulNumberImpl implements ThinkfulNumber {
    private int wallSize;
    private int pixelSize;

    public ThinkfulNumberImpl(final Scanner scanner) {
        setWallSize(scanner.nextInt());
        setPixelSize(scanner.nextInt());
    }

    public int getWallSize() {
        return wallSize;
    }

    public void setWallSize(final int wallSize) {
        this.wallSize = Math.max(wallSize, 1);
    }

    public int getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(final int pixelSize) {
        this.pixelSize = Math.max(pixelSize, 1);
    }

    @Override
    public boolean isDivisible() {
        return getWallSize() % getPixelSize() == 0;
    }
}
