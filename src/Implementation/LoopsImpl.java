package Implementation;

import Loops.*;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsImpl {

    public static void maps() {
        System.out.println("beginner-lost-without-a-map");
        System.out.println("Введіть кількість чисел");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] arr = new int[l];
        System.out.println("Введіть " + l + " чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = Maps.map(arr);
        System.out.println("Подвоєні числа: ");
        for (int i : arr2) {
            System.out.print(i+ " ");
        } 
        scanner.close();
    }

    public static void sumOfPositive(){
        System.out.println("sum-of-positive");
        System.out.println("Введіть кількість чисел");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] arr = new int[l];
        System.out.println("Введіть " + l + " чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Сума позитивних чисел " + Positive.sum(arr));
        scanner.close();
    }

    public static void gapInPr(){
        System.out.println("gap-in-primes");
        System.out.println("Вкажіть розрив(gap)");
        Scanner scanner = new Scanner(System.in);
        int gap = scanner.nextInt();
        System.out.println("Вкажіть числа початку і кінця пошуку");
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        System.out.println("Розрив між " + start + " і " + end + ": " + Arrays.toString(GapInPrimes.gap(gap, start, end)));
        scanner.close();
    }
    public static void repeatString() {
        System.out.println("string-repeat");
        System.out.println("Вкажіть стрічку");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println("Вкажіть кількість повторів");

        int repeat = scanner.nextInt();
        System.out.println(Solution.repeatStr(repeat, string));
        scanner.close();
    }

    public static void doSequence() {
        System.out.println("reversedSequence");
        System.out.println("Вкажіть число");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(Arrays.toString(Sequence.reverse(amount)));
        scanner.close();
    }
    public static void twiceAsOld() {
        System.out.println("twice-as-old");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть вік тата");
        int fathersAge = scanner.nextInt();
        System.out.println("Введіть вік сина");
        int sonsAge = scanner.nextInt();

        System.out.println(TwiceAsOld.twiceAsOld(fathersAge,sonsAge));
        scanner.close();
    }
}
