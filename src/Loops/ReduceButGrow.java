package JavaClub4.src.Loops;

public class ReduceButGrow {
    public static int grow(int[] x){
        int result = 1;
        for (int i: x){
            result *= i;
        }
        return result;
    }
}
