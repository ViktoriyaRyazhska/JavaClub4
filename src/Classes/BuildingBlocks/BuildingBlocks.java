package Classes.BuildingBlocks;

/* The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.

Define these methods:

`get_width()` return the width of the `Block`

`get_length()` return the length of the `Block`

`get_height()` return the height of the `Block`

`get_volume()` return the volume of the `Block`

`get_surface_area()` return the surface area of the `Block` */

public class BuildingBlocks {
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surface_area;

    public BuildingBlocks(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurface_area() {
        return 2 * (width * length + width * height + length * height);
    }

    public static void main(String[] args) {
        BuildingBlocks buldingBlocks = new BuildingBlocks(2,3,4);
        System.out.println(buldingBlocks.getVolume());
        System.out.println(buldingBlocks.getSurface_area());
    }
}
