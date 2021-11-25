package loops;

public class Loops_Task_6 {
    public static int[] reverse(int n){
        int [] arr = new int[n];
        int lenght = n;
        for (int i = 0; i < lenght; i++) {
            arr[i] = n;
            n--;
        }
        return arr;
    }
}
