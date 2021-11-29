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
                System.out.println("Площа квадрата " + Calculator.getTotalArea(new Square(side)));
                break;
            case 2:
                System.out.println("Вкажіть висоту і ширину прямокутника");
                double height = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println("Площа прямокутника " + Calculator.getTotalArea(new Rectangle(height, width)));
                break;
            case 3:
                System.out.println("Вкажіть радіус круга");
                double radius = scanner.nextDouble();
                System.out.println("Площа круга " + Calculator.getTotalArea(new Circle(radius)));
                break;
            case 4:
                System.out.println("Вкажіть основу і висоту трикутника");
                double triangleBase = scanner.nextDouble();
                double triangleHeight = scanner.nextDouble();
                System.out.println(
                        "Площа трикутника " + Calculator.getTotalArea(new Triangle(triangleBase, triangleHeight)));
                break;
        }
        scanner.close();
    }
<<<<<<< HEAD

    public static void Leetspeak (Scanner scanner){
        System.out.println("Leetspeak");
        System.out.println("Введіть значення");
        Leetspeak leetspeak = new Leetspeak();
        String s = scanner.next();
        System.out.println(leetspeak.encode(s));
    }
<<<<<<< HEAD
=======
=======
>>>>>>> 044845917f57b98d5eba9279a06e45508285cf02
    public static void createHuman() {
        System.out.println("God");

        Human[] human = God.create();

        Man man = (Man) human[0];
        Woman woman = (Woman) human[1];

        System.out.println("Created man and woman");
    }

<<<<<<< HEAD
>>>>>>> ee0298bd7dfb1843b5e0df634480e0e78eae927b
=======
>>>>>>> 044845917f57b98d5eba9279a06e45508285cf02
}
