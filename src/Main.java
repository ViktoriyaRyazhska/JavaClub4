package JavaClub4.src;

import JavaClub4.src.Basic.MultiplyingTwoNumbers;
import JavaClub4.src.Basic.VolumeOfACuboid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Вирішення задач---");
        System.out.println("---Виберіть тип задачі---\n1.Basic program" +
                "\n2.Classes\n3.Conditions\n4.Loops\n5.OOP\n6.String\n7.Collections");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("-Basic program-\n");
                System.out.println("Виберіть задачу\n1.you-cant-code-under-pressure-number-1" +
                        "\n2.function-3-multiplying-two-numbers\n3.volume-of-a-cuboid" +
                        "\n4.thinkful-number-drills-pixelart-planning\n5.jennys-secret-message" +
                        "\n6.convert-to-binary\n7.beginner-series-number-2-clock\n7.century-from-year" +
                        "\n8.return-negative\n9.age-range-compatibility-equation\n10.grasshopper-debug");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        break;
                    case 2:
                        System.out.println("--function-3-multiplying-two-numbers--");
                        System.out.println("Введіть числа для перемноження");
                        int xMul, yMul;
                        xMul = scanner.nextInt();
                        yMul = scanner.nextInt();
                        System.out.println(MultiplyingTwoNumbers.multiply(xMul,yMul));
                        break;
                    case 3:
                        System.out.println("--volume-of-a-cuboid--");
                        System.out.println("Введіть сторони кубоїда");
                        int xCub, yCub, zCub;
                        xCub = scanner.nextInt();
                        yCub  = scanner.nextInt();
                        zCub = scanner.nextInt();
                        System.out.println(VolumeOfACuboid.getVolumeOfCuboid(xCub,yCub,zCub));
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                }
                break;
            case 2:
                System.out.println("-Classes-\n");
                System.out.println("Виберіть задачу");
                break;
            case 3:
                System.out.println("-Conditions-\n");
                System.out.println("Виберіть задачу");
                break;
            case 4:
                System.out.println("-Loops-\n");
                System.out.println("Виберіть задачу");
                break;
            case 5:
                System.out.println("-OOP-\n");
                System.out.println("Виберіть задачу");
                break;
            case 6:
                System.out.println("-String-\n");
                System.out.println("Виберіть задачу");
                break;
            case 7:
                System.out.println("-Collections-\n");
                System.out.println("Виберіть задачу");
                break;
        }

    }
}
