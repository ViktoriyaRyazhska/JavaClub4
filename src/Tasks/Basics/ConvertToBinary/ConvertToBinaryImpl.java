package Tasks.Basics.ConvertToBinary;

import java.util.Scanner;

public class ConvertToBinaryImpl implements ConvertToBinary {
    private int n;

    public ConvertToBinaryImpl(final Scanner scanner) {
        setN(scanner.nextInt());
    }

    public ConvertToBinaryImpl(int n) {
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 1);
    }

    @Override
    public String toBinary() {
        return  Integer.toBinaryString(getN());
    }
}
