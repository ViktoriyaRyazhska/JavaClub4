package tasks.loops;

import java.util.Arrays;

public class GrassHopperSum {

    private static int summation(int n) {
        int sum = 0;
        for(int i = 0; i < n+1; i++){
            sum += i;
        }
        return sum;
    }
    public void execute(int n){
        System.out.println(summation(n));
    }
}
