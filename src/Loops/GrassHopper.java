package Loops;

public class GrassHopper {
    public static int summation(int n) {
        int summation = 0;
        for (int i = 1; i <= n; i++){
            summation += i;
        }
        return summation;
    }
}
