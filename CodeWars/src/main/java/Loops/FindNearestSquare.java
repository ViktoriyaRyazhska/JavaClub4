package Loops;

public class FindNearestSquare {
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}

