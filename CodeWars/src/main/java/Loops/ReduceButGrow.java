package Loops;

public class ReduceButGrow {
    public static int grow(int[] x){
        int multiply = 1;
        for(int i = 0;i<x.length;i++){
            multiply *= x[i];

        }
        return multiply;
    }
}
