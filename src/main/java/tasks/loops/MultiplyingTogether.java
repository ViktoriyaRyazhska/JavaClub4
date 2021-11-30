package tasks.loops;

import java.util.Arrays;

public class MultiplyingTogether {
    public static int grow(int[] value){
        return Arrays.stream(value).reduce(1, (a, b) -> a * b);
    }
}
