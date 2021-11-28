package Tasks.Classes.BuildingBlocks;

import java.util.Scanner;

public class BuildingBlocksImpl implements BuildingBlocks {
    private int width;
    private int length;
    private int height;

    public BuildingBlocksImpl(final Scanner scanner) {
        setWidth(scanner.nextInt());
        setLength(scanner.nextInt());
        setHeight(scanner.nextInt());
    }

    public BuildingBlocksImpl(int width, int length, int height) {
        setWidth(width);
        setLength(length);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = Math.max(width, 1);
    }

    public int getLength() {
        return length;
    }

    public void setLength(final int length) {
        this.length = Math.max(length, 2);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = Math.max(height, 1);
    }

    @Override
    public int getVolume() {
        return width * length * height;
    }

    @Override
    public int getSurfaceArea() {
        return 2 * (getWidth() * getLength() + getWidth() * getHeight() + getLength() * getHeight());
    }
}
