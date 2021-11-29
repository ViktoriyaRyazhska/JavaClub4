package Implementation;

import OOP.*;
import java.util.Scanner;

public class OopImpl {

    public static void calcShape() {
        System.out.println("tdd-area-calculations");
        System.out.println("Вкажіть цифрою яку фігуру Ви бажаєте створити:");
        System.out.println("1 = квадрат, 2 = прямокутник, 3 = коло, 4 = трикутник");
        Scanner scanner = new Scanner(System.in);
        int shape = scanner.nextInt();
        Calculator calculator = new Calculator();
        switch (shape) {
            case 1:
                System.out.println("Вкажіть розмір сторони квадрата");
                double side = scanner.nextDouble();
                System.out.println("Площа квадрата " + calculator.getTotalArea(new Square(side)));
                break;
            case 2:
                System.out.println("Вкажіть висоту і ширину прямокутника");
                double height = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println("Площа прямокутника " + calculator.getTotalArea(new Rectangle(height, width)));
                break;
            case 3:
                System.out.println("Вкажіть радіус круга");
                double radius = scanner.nextDouble();
                System.out.println("Площа круга " + calculator.getTotalArea(new Circle(radius)));
                break;
            case 4:
                System.out.println("Вкажіть основу і висоту трикутника");
                double triangleBase = scanner.nextDouble();
                double triangleHeight = scanner.nextDouble();
                System.out.println(
                        "Площа трикутника " + calculator.getTotalArea(new Triangle(triangleBase, triangleHeight)));
                break;
        }
        scanner.close();
    }

    public static void createHuman() {
        System.out.println("God");

        Human[] human = God.create();

        Man man = (Man) human[0];
        Woman woman = (Woman) human[1];

        System.out.println("Created man and woman");
    }
}
