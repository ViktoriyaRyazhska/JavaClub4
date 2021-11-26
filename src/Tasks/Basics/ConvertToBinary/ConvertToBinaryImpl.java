package Tasks.Basics.ConvertToBinary;

import java.util.Scanner;

/**
 * Given a non-negative integer n,
 * write a function to_binary/ToBinary which returns that number in a binary format.
 */
public class ConvertToBinaryImpl implements ConvertToBinary{
    private int n;

    public ConvertToBinaryImpl(final Scanner scanner) {
        setN(scanner.nextInt());
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 1);
    }

    @Override
    public int toBinary() {
        final String binary = Integer.toBinaryString(getN());
        return Integer.parseInt(binary);
    }
}
