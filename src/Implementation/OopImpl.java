package Implementation;

import OOP.*;
import java.util.Scanner;

public class OopImpl {

    public static void calcShape() {
        System.out.println("tdd-area-calculations");
        System.out.println("Вкажіть цифрою яку фігуру Ви бажаєте створити:");
        System.out.println("1 = квадрат, 2 = прямокутник, 3 = коло, 4 = тикутник");
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

    public static void Leetspeak (Scanner scanner){
        System.out.println("Leetspeak");
        System.out.println("function to encode a string into its leetspeak version" +
                "\na -> 4" +
                "\ne -> 3" +
                "\nl -> 1" +
                "\nm -> /^^\\" +
                "\no -> 0" +
                "\nu -> (_) +" +
                "\nexample: abcdef");
        System.out.println("Введіть значення");
        Leetspeak leetspeak = new Leetspeak();
        String s = scanner.next();
        System.out.println("Result: " + leetspeak.encode(s));
    }
}
