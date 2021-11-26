package classes;

import java.util.Scanner;

public class Classes_Task_6 {

    private int arr [];
    private final int width;
    private int length;
    private int height;

    public Classes_Task_6(int[] arr) {
        this.arr = arr;
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public int getVolume() {
        int volume = width * length * height;
        return volume;
    }
    public int getSurfaceArea() {
        int surfaceArea = 2*(width * length + width * height + length * height);
        return surfaceArea;
    }
    public static void solveTask(){
        System.out.println("This program takes three parameters (width, length, height)\n" +
                "and returns surface area and volume\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width:");
        int value1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter length:");
        int value2 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter height:");
        int value3 = scanner2.nextInt();
        int [] arr = {value1,value2,value3};
        Classes_Task_6 n = new Classes_Task_6(arr);


        System.out.println("So, now it will return surface area and volume\nResult: ");
        System.out.println("-----------");
        System.out.println("Volume : " + n.getVolume());
        System.out.println("Surface area : " + n.getSurfaceArea());
        System.out.println("-----------");

    }
}
