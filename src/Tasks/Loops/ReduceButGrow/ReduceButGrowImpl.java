package Tasks.Loops.ReduceButGrow;

import java.util.Scanner;

public class ReduceButGrowImpl implements ReduceButGrow{
    private int[] array;
    private int n;

    public ReduceButGrowImpl(final Scanner scanner) {
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
    public int multiplyingValues() {
        int product = 1;
        for (int i = 0; i < getArray().length; i++){
            product *= getArray()[i];
        }
        return product;
    }
}
