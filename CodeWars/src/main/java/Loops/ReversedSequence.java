package Loops;

public class ReversedSequence {
    public static int[] reverse(int n){
        int [] num = new int[n];
        for(int i = n ;i > 0 ;i--){
            num[n-i]=i;
        }
        return num ;
    }
}
