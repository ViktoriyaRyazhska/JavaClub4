package tasks.conditions;

public class IsDivisibleByTwoNums {

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    public void execute(long n, long x, long y){
        System.out.println(isDivisible(n, x, y));
    }

}
