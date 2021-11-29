package Implementation;

import Loops.*;

import java.util.ArrayList;
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
<<<<<<< HEAD

    public static void MeanOfAnArray (Scanner scanner){
        System.out.println("Mean of an array");
        System.out.println("Введіть оцінки");

        int grades;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter non integer to exit");
        while (true){
            if (scanner.hasNextInt()){
                grades = scanner.nextInt();
                list.add(grades);
            } else {
                break;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i< arr.length; i++){
            arr[i] = list.get(i);
        }
        System.out.println(MeanOfAnArray.getAverage(arr));
    }

    public static void ReduceButGrow (Scanner scanner) {
        System.out.println("Reduce but grow");
        System.out.println("Введіть значення");

        int values;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter non integer to exit");
        while (true){
            if (scanner.hasNextInt()){
                values = scanner.nextInt();
                list.add(values);
            } else {
                break;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i< arr.length; i++){
            arr[i] = list.get(i);
        }
        System.out.println(ReduceButGrow.grow(arr));
    }

    public static void GrassHopper (Scanner scanner) {
        System.out.println("Grass hopper");
        System.out.println("Введіть значення");

        int n = scanner.nextInt();
        System.out.println(GrassHopper.summation(n));
=======
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
>>>>>>> ee0298bd7dfb1843b5e0df634480e0e78eae927b
    }
}
