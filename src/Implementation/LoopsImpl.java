package Implementation;

import Loops.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LoopsImpl {
    public static void humanYearsCatYearsDogYears(Scanner scanner) {
		System.out.println("cat-years-dog-years");
		System.out.println("Введіть вік щоб дізнатись вік кота або собаки: ");
		int num = scanner.nextInt();
		CatDogYears catDogYears = new CatDogYears();
		catDogYears.execute(num);
	}
	
    public static void maps(Scanner scanner) {
        System.out.println("beginner-lost-without-a-map");
        System.out.println("Введіть кількість чисел");
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
    }

    public static void sumOfPositive(Scanner scanner){
        System.out.println("sum-of-positive");
        System.out.println("Введіть кількість чисел");
        int l = scanner.nextInt();
        int[] arr = new int[l];
        System.out.println("Введіть " + l + " чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Сума позитивних чисел " + Positive.sum(arr));
    }

    public static void gapInPr(Scanner scanner){
        System.out.println("gap-in-primes");
        System.out.println("Вкажіть розрив(gap)");
        int gap = scanner.nextInt();
        System.out.println("Вкажіть числа початку і кінця пошуку");
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        System.out.println("Розрив між " + start + " і " + end + ": " + Arrays.toString(GapInPrimes.gap(gap, start, end)));
    }

    public static void MeanOfAnArray (Scanner scanner){
        System.out.println("Mean of an array");
        System.out.println("Return the average of the given array rounded down to its nearest integer");
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
        System.out.println("Mean of an array: " + MeanOfAnArray.getAverage(arr));
    }
    
    public static void getAverage(Scanner scanner) {
		System.out.println("how-good-are-you-really");
		System.out.println("Введіть свою оцінку: ");
		System.out.println("Введіть загальну кількість оцінок: ");
		int num = scanner.nextInt();
		int[] array = new int[num];
		System.out.println("Введіть оцінки: ");
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		Average averageMarks = new Average();
		System.out.println(Average.getAverage(array));
    }
    
    public static void ReduceButGrow (Scanner scanner) {
        System.out.println("Reduce but grow");
        System.out.println("Return the result of multiplying the values together");
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
        System.out.println("Result: " + ReduceButGrow.grow(arr));
    }

    public static void nearestSq(Scanner scanner) {
		System.out.println("find-nearest-square-number");
		System.out.println("Введіть число щоб знайти найближчий квадрат: ");
		int num = scanner.nextInt();
		NearestSquareNum nearestSquareNum = new NearestSquareNum();
		System.out.println(NearestSquareNum.nearestSq(num));
	}

    public static void GrassHopper (Scanner scanner) {
        System.out.println("Grasshopper - Summation");
        System.out.println("Finds the summation of every number from 1 to num");
        System.out.println("Введіть значення");

        int n = scanner.nextInt();
        System.out.println("Summation: " + GrassHopper.summation(n));
    }

    public static void repeatString(Scanner scanner) {
        System.out.println("string-repeat");
        System.out.println("Вкажіть стрічку");
        String string = scanner.next();
        System.out.println("Вкажіть кількість повторів");

        int repeat = scanner.nextInt();
        System.out.println(Solution.repeatStr(repeat, string));
    }

    public static void doSequence(Scanner scanner) {
        System.out.println("reversedSequence");
        System.out.println("Вкажіть число");
        int amount = scanner.nextInt();
        System.out.println(Arrays.toString(Sequence.reverse(amount)));
    }
    public static void twiceAsOld(Scanner scanner) {
        System.out.println("twice-as-old");
        System.out.println("Введіть вік тата");
        int fathersAge = scanner.nextInt();
        System.out.println("Введіть вік сина");
        int sonsAge = scanner.nextInt();

        System.out.println(TwiceAsOld.twiceAsOld(fathersAge,sonsAge));
    }
    public static void Sheeps(Scanner scanner){
        System.out.println("counting-sheep-dot-dot-dot");
        System.out.println("Введіть кількість елементів");
        int l = scanner.nextInt();
        boolean[] sheps = new boolean[l];
        for (int i = 0; i < sheps.length; i++) {
            System.out.println("Введіть 1, якщо true або 0, якщо false");
            int a = scanner.nextInt();
            if(a == 1){
                sheps[i] = true;
            }
            else if (a == 0){
                sheps[i] = false;
            }
        }
        System.out.println("Кількість овець: " + CounterOfShips.countSheeps(sheps));
    }
    public static void TailToHead(Scanner scanner){
        System.out.println("my-head-is-at-the-wrong-end");
        System.out.println("Введіть кількість елементів");
        int l = scanner.nextInt();
        String[] sheps = new String[l];
        System.out.println("Введіть елементи, кіклькість яких: " + l );
        for (int i = 0; i < sheps.length; i++) {
            sheps[i] = scanner.next();
        }
        System.out.println("Нова стрічка: " + Arrays.toString(WrongEndHead.fixTheMeerkat(sheps)));
    }
    public static void TheGame(Scanner scanner){
        System.out.println("21-sticks");
        System.out.println("Введіть кількість паличко(від 1 до 3)");
        int l = scanner.nextInt();
        System.out.println("Нова стрічка: " + TheGame21.makeMove(l));
    }
}
