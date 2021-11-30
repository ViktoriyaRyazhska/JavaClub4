package tasks.loops;

import java.util.Arrays;

public class SumOfPositives {
    public static int sum(int[] values){
        return Arrays.stream(values).filter(value -> value > 0).sum();
    }
}
