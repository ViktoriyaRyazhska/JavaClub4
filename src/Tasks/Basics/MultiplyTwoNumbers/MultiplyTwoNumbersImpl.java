package Tasks.Basics.MultiplyTwoNumbers;

import java.util.Scanner;

public class MultiplyTwoNumbersImpl implements MultiplyTwoNumbers {
    private int a;
    private int b;

    public MultiplyTwoNumbersImpl(final Scanner scanner) {
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
    }

    public MultiplyTwoNumbersImpl(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(final int b) {
        this.b = b;
    }

    @Override
    public int product() {
        return getA() * getB();
    }
}
