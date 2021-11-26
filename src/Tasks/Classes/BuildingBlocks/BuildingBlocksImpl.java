package Tasks.Classes.BuildingBlocks;

/* The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.

Define these methods:

`get_width()` return the width of the `Block`

`get_length()` return the length of the `Block`

`get_height()` return the height of the `Block`

`get_volume()` return the volume of the `Block`

`get_surface_area()` return the surface area of the `Block` */

import java.util.Scanner;

public class BuildingBlocksImpl implements BuildingBlocks{
    private int width;
    private int length;
    private int height;

    public BuildingBlocksImpl(final Scanner scanner) {
        setWidth(scanner.nextInt());
        setLength(scanner.nextInt());
        setHeight(scanner.nextInt());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.max(width, 1);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = Math.max(length, 2);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
