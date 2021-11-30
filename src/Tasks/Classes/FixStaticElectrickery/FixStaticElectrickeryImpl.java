package Tasks.Classes.FixStaticElectrickery;

import java.util.Scanner;

public class FixStaticElectrickeryImpl implements FixStaticElectrickery {
    private final static int ONE_HUNDRED = 100;
    private static int value;
    private int n;

    public FixStaticElectrickeryImpl(final Scanner scanner) {
        value = ONE_HUNDRED;
        this.n = scanner.nextInt();
    }

<<<<<<< HEAD
    public FixStaticElectrickeryImpl(final int n) {
        value = ONE_HUNDRED;
        this.n = n;
=======
    public FixStaticElectrickeryImpl(int n) {
        value = ONE_HUNDRED;
        setN(n);
>>>>>>> 875559889636b5d43aaab4ffc1a281f0429ac6c8
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
