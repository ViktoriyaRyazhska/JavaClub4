package classes;
import java.util.Scanner;

import static java.math.BigInteger.valueOf;
public class Classes_Task_3 {
    final long top;
    final long bottom;

    public Classes_Task_3(long numerator, long denominator) {
        long gcd = valueOf(numerator).gcd(valueOf(denominator)).longValue();
        top = numerator / gcd;
        bottom = denominator / gcd;
    }

    public Classes_Task_3 add(Classes_Task_3 f2) {
        return new Classes_Task_3(top * f2.bottom + f2.top * bottom, bottom * f2.bottom);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    @Override
    public boolean equals(Object o) {
        return top * ((Classes_Task_3) o).bottom == ((Classes_Task_3) o).top * bottom;
    }
    public static void solveTask(){
        System.out.println("You are provided with a skeleton of the class 'Fraction', which accepts two arguments (numerator, denominator). This program makes this class string representable, and addable while keeping the result in the minimum representation possible");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your numerator : ");
        int value1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your denominator : ");
        int value2 = scanner2.nextInt();


        System.out.println("So, now it will return increased number\nResult: ");
        System.out.println("-----------");
        System.out.println(new Classes_Task_3(value1,value2));
        System.out.println("-----------");

    }
}
