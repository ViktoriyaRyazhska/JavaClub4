package tasks.loops;

import java.util.Arrays;

public class Maps {
    public static int[] map(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            arr[i] *=2;
        }
        return arr;
    }
    public void execute(int[] arr){
        System.out.println(Arrays.toString(map(arr)));
    }
}