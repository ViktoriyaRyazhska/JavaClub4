package Tasks.Basics.MultiplyTwoNumbers;

import java.util.Scanner;

public class MultiplyTwoNumbersImpl implements MultiplyTwoNumbers {
    private int number1;
    private int number2;

    public MultiplyTwoNumbersImpl(final Scanner scanner) {
        this.number1 = scanner.nextInt();
        this.number2 = scanner.nextInt();
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(final int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(final int number2) {
        this.number2 = number2;
    }

    @Override
    public int multiply() {
        return getNumber1() * getNumber2();
    }
}
