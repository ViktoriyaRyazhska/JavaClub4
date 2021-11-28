package Loops;

public class Sequence{

    public static int[] reverse(int n){
        int[] tempArr = new int[n];
        for (int i = n; i > 0; i--){
            tempArr[n - i] = i;
        }
        return tempArr;
    }

}