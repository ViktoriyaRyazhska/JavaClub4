package Classes;

public class BuildingBlocks {
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;

    public BuildingBlocks(int arr[]) {
        width = arr[0];
        length = arr[1];
        height = arr[2];

        surfaceArea = (height * width + length * width + height * length) * 2;
        volume = height * width * length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getVolume() {
        return volume;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

}

