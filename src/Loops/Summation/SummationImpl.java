package Loops.Summation;

import java.util.Scanner;

public class SummationImpl implements Summation {
    private int n;

    public SummationImpl(final Scanner scanner) {
        setN(scanner.nextInt());
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
       this.n = Math.max(n, 1);
    }

    @Override
    public int summation(){
        int sum = 0;
        for (int i = 1; i < getN() + 1; i++){
            sum += i;
        }
        return sum;
    }
}
