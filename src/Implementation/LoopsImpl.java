package Implementation;

import Loops.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LoopsImpl {
    public static void humanYearsCatYearsDogYears() {
		System.out.println("cat-years-dog-years");
		System.out.println("Введіть вік щоб дізнатись вік кота або собаки: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		CatDogYears catDogYears = new CatDogYears();
		catDogYears.execute(num);
	}
	
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
    
    public static void getAverage() {
		System.out.println("how-good-are-you-really");
		System.out.println("Введіть свою оцінку: ");
		System.out.println("Введіть загальну кількість оцінок: ");
		Scanner scanner = new Scanner(System.in);
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

    public static void nearestSq() {
		System.out.println("find-nearest-square-number");
		System.out.println("Введіть число щоб знайти найближчий квадрат: ");
		Scanner scanner = new Scanner(System.in);
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
    public static void Sheeps(){
        System.out.println("counting-sheep-dot-dot-dot");
        System.out.println("Введіть кількість елементів");
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
    public static void TailToHead(){
        System.out.println("my-head-is-at-the-wrong-end");
        System.out.println("Введіть кількість елементів");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        String[] sheps = new String[l];
        System.out.println("Введіть елементи, кіклькість яких: " + l );
        for (int i = 0; i < sheps.length; i++) {
            sheps[i] = scanner.next();
        }
        System.out.println("Нова стрічка: " + Arrays.toString(WrongEndHead.fixTheMeerkat(sheps)));
        scanner.close();
    }
    public static void TheGame(){
        System.out.println("21-sticks");
        System.out.println("Введіть кількість паличко(від 1 до 3)");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        System.out.println("Нова стрічка: " + TheGame21.makeMove(l));
        scanner.close();
    }
}
