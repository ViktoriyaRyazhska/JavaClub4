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

    public static void encapsulation(){
        System.out.println("lombok-encapsulation");
        System.out.println("Введіть число, стрічку і об'єкт");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        Object o = null;
        EncapsulationDemo ed = new EncapsulationDemo(n, s, o);
        System.out.println("Ви ввели: " + ed.getNumber() + " " + ed.getStringValue() + " " + ed.getAnObject());
        System.out.println("Введіть нові значення числа");
        ed.setNumber(scanner.nextInt());
        System.out.println("Введіть нові значення стрічки");
        ed.setStringValue(scanner.nextLine());
        System.out.println("Ви ввели: " + ed.getNumber() + " " + ed.getStringValue() + " " + ed.getAnObject());
        scanner.close();
    }

    public static void twoFighters(){
        System.out.println("two-fighters-one-winner");
        System.out.println("Введіть ім'я, здоров'я і силу удару для 1 бійця");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int health = scanner.nextInt();
        int damagePerAttack = scanner.nextInt();
        Fighter f1 = new Fighter(name, health, damagePerAttack);
        System.out.println("Введіть ім'я, здоров'я і силу удару для 2 бійця");
        String name2 = scanner.next();
        int health2 = scanner.nextInt();
        int damagePerAttack2 = scanner.nextInt();
        Fighter f2 = new Fighter(name2, health2, damagePerAttack2);
        System.out.println("Введіть ім'я бійця, який перший атакує");
        String firstAttacker = scanner.next();
        System.out.println("Переміг " + Fighters.declareWinner(f1, f2, firstAttacker));
        scanner.close();
    }
}

