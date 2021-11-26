package Tasks.Loops.SumOfPositive;

import java.util.Scanner;

public class SumOfPositiveImpl implements SumOfPositive{
    private int[] array;
    private int n;

    public SumOfPositiveImpl(final Scanner scanner) {
        setN(scanner.nextInt());
        array = new int[getN()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 1);
    }

    @Override
    public int sumOfPositive() {
        int sum = 0;
        for (int i = 0; i < getArray().length; i++){
            if(getArray()[i] > 0){
                sum += getArray()[i];
            }
        }
        return sum;
    }
}
