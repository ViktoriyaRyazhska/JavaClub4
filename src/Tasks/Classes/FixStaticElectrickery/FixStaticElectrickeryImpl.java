package Tasks.Classes.FixStaticElectrickery;

import java.util.Scanner;

public class FixStaticElectrickeryImpl implements FixStaticElectrickery{
    private final static int ONE_HUNDRED = 100;
    private static int value;
    private int n;

    public FixStaticElectrickeryImpl(final Scanner scanner) {
        value = ONE_HUNDRED;
        this.n = scanner .nextInt();
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = n;
    }

    @Override
    public int plus100() {
        return value + getN();
    }
}
