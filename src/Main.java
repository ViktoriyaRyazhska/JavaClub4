
import Basic.MultiplyingTwoNumbers;
import Basic.VolumeOfACuboid;
import Implementation.*;
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
                System.out.println("Виберіть задачу\n1.lombok-encapsulation" +
                    "\n2.fixme-static-electrickery" +
                    "\n3.two-fighters-one-winner" +
                    "\n4.building-blocks" +
                    "\n5.fractions-class" +
                    "\n6.simple-drawing-board");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        ClassesImpl.encapsulation();
                        break;
                    case 2:
                        break;
                    case 3:
                        ClassesImpl.twoFighters();
                        break;
                    case 4:
                        ClassesImpl.buildingBlocks();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
                break;
            case 3:
                System.out.println("-Conditions-\n");
                System.out.println("Виберіть задачу\n1.opposite-number" +
                    "\n2.is-n-divisible-by-x-and-y" +
                    "\n3.convert-a-boolean-to-a-string" +
                    "\n4.do-i-get-a-bonus" +
                    "\n5.how-old-will-i-be-in-2099" +
                    "\n6.rock-paper-scissors" + 
                    "\n7.basic-mathematical-operations" +
                    "\n8.opposites-attract" +
                    "\n9.convert-boolean-values-to-strings-yes-or-no" +
                    "\n10.will-there-be-enough-space" +
                    "\n11.the-modulo-3-sequence" +
                    "\n12.switch-it-up" +
                    "\n13.thinkful-logic-drills-traffic-light" + 
                    "\n14.transportation-on-vacation");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        ConditionsImpl.oppositeNumber();
                        break;
                    case 2:
                        break;
                    case 3:
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
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                }
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
