package Application;

import Classes.BuildingBlocks;
import Classes.Lombok;
import Classes.TwoFighters;

import java.util.Scanner;

public class ClassesList {
    public static String classesList() {
        String tasks =
                "1 - Lombok encapsulation\n" +
                        "2 - FixMe static electrickery\n" +
                        "3 - Fractions class\n" +
                        "4 - Simple drawning board\n" +
                        "5 - Two fighters one winner\n" +
                        "6 - Building blocks";

        return tasks;
    }

    public static void choiceClasses() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try {
            switch (num) {
                default -> System.out.println("The is no such a task");
                case 1 -> {
                    Lombok lom = new Lombok();
                    System.out.println(lom.getNumber());
                    break;
                }
                case 2 -> {
                    break;
                }
                case 3 -> {

                    break;
                }
                case 4 -> {
                    break;
                }
                case 5 -> {
                    System.out.println("First player health: ");
                    int healthPl1 = scanner.nextInt();
                    System.out.println("First player name: ");
                    String namePl1 = scanner.next();
                    System.out.println("First player damage: ");
                    int damagePl1 = scanner.nextInt();
                    System.out.println("Second player health: ");
                    int healthPl2 = scanner.nextInt();
                    System.out.println("Second player name: ");
                    String namePl2 = scanner.next();
                    System.out.println("Second player damage: ");
                    int damagePl2 = scanner.nextInt();
                    System.out.println("Who will attack at first? :");
                    String attacker = scanner.next();
                    System.out.println(TwoFighters.declareWinner(new TwoFighters.Fighter(healthPl1, namePl1, damagePl1),
                            new TwoFighters.Fighter(healthPl2, namePl2, damagePl2), attacker));
                    break;
                }
                case 6 -> {
                    System.out.println("Please type main parameters of figure : ");
                    BuildingBlocks b = new BuildingBlocks(new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()});
                    System.out.println("Height :" + b.getHeight());
                    System.out.println("Length :" + b.getLength());
                    System.out.println("Width :" + b.getWidth());
                    System.out.println("Volume :" + b.getVolume());
                    System.out.println("SurfaceArea :" + b.getSurfaceArea());
                    break;
                }
            }
        }finally {
            FinallyMethod.finallyMethod(scanner);
        }
    }
}

