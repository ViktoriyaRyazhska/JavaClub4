package Loops.ArrayMean;

import java.util.Scanner;

public class ArrayMeanImpl implements ArrayMean {
    private int[] array;
    private int n;

    public ArrayMeanImpl(final Scanner scanner) {
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
    public int averageOfArray() {
        int sum = 0;
        for (int i = 0; i < getArray().length; i++) {
            sum += getArray()[i];
        }
        final double average = 1.0 * sum / getArray().length;
        final double fraction = average % 1;

        return fraction < 0.5 ? (int) average : (int) average + 1;
    }
}
