package Tasks.Loops.DoubledArray;

import java.util.Scanner;

public class DoubledArrayImpl implements DoubledArray{
    private int[] array;
    private int n;

    public DoubledArrayImpl(final Scanner scanner) {
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
    public int[] doubleArray() {
        for (int i = 0; i < getArray().length; i++){
            getArray()[i] *= 2;
        }
        return getArray();
    }
}
