package Implementation;
import java.util.Scanner;

import Classes.*;

public class ClassesImpl {
    public static void buildingBlocks() {
        System.out.println("building-blocks");
        System.out.println("Введіть ширину, довжину та висоту блоку");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        Block b = new Block(arr);
        System.out.println("Ширина блоку " + b.getWidth());
        System.out.println("Довжина блоку " + b.getLength());
        System.out.println("Висота блоку " + b.getHeight());
        System.out.println("Об'єм блоку: " + b.getVolume() + "\nПлоща поверхні блоку: " + b.getSurfaceArea());
        scanner.close();
    }
}

