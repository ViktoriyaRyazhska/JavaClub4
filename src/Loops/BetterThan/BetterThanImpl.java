package Loops.BetterThan;

import java.util.Scanner;

public class BetterThanImpl implements BetterThan{
    private int[] array;
    private int n;
    private int point;

    public BetterThanImpl(final Scanner scanner) {
        setN(scanner.nextInt() + 1);
        this.array = new int[getN()];
        for (int i = 0; i < getArray().length - 1; i++) {
            this.array[i] = scanner.nextInt();
        }
        setPoint(scanner.nextInt());
    }

    public void setArray(final int[] array) {
        this.array = array;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(final int point) {
        this.point = Math.max(point, 1);
    }

    @Override
    public boolean betterThanAverage() {
        int sum = 0;
        getArray()[getArray().length - 1] = getPoint();

        for (int i = 0; i < getArray().length; i++) {
            sum += getArray()[i];
        }
        final double average = 1.0 * sum / getArray().length;
        return average < array[getArray().length - 1];
    }
}
