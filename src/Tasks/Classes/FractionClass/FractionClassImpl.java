package Tasks.Classes.FractionClass;

import java.util.Scanner;

public class FractionClassImpl implements FractionClass {
    private int integer;
    private double fraction;
    private boolean isPositive = true;

    public FractionClassImpl() {
        setInteger(0);
        setFraction(0.0);
        setIsPositive(true);
    }

    public FractionClassImpl(final Scanner scanner) {
        setInteger(scanner.nextInt());
        scanner.nextLine();
        setFraction(scanner.nextDouble());
    }

    public FractionClassImpl(int integer, double fraction, boolean isPositive) {
        setInteger(integer);
        setFraction(fraction);
        setIsPositive(isPositive);
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(final int integer) {
        this.isPositive = integer >= 0;

        this.integer = Math.abs(integer);
    }

    public double getFraction() {
        return fraction;
    }

    public void setFraction(final double fraction) {
        if (this.isPositive()) {
            this.isPositive = fraction > 0;
        } else {
            this.isPositive = false;
        }

        if (Math.abs(fraction) >= 1) {
            this.fraction = Math.abs(fraction) % 1;
            this.integer += (int) Math.abs(fraction);
        } else {
            this.fraction = Math.abs(fraction);
        }
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setIsPositive(final boolean positive) {
        this.isPositive = positive;
    }

    @Override
    public FractionClass add(final FractionClass a) {
        final FractionClassImpl result = new FractionClassImpl();

        final double sum = this.toDouble() + a.toDouble();

        result.setInteger((int) sum);
        result.setFraction(sum % 1);

        return result;
    }

    @Override
    public FractionClass differ(final FractionClass a) {
        final FractionClassImpl result = new FractionClassImpl();

        final double minus = this.toDouble() - a.toDouble();

        result.setInteger((int) minus);
        result.setFraction(minus % 1);

        return result;
    }

    @Override
    public FractionClass multi(final FractionClass a) {
        final FractionClassImpl result = new FractionClassImpl();

        final double product = this.toDouble() * a.toDouble();

        result.setInteger((int) product);
        result.setFraction(product % 1);

        return result;
    }

    @Override
    public FractionClass divide(final FractionClass a) throws ArithmeticException {
        final FractionClassImpl result = new FractionClassImpl();

        if (a.toDouble() == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        }
        final double division = this.toDouble() / a.toDouble();

        result.setInteger((int) division);
        result.setFraction(division % 1);

        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(this.toDouble());
    }

    @Override
    public double toDouble() {
        final double res = this.integer + this.fraction;
        return res * (isPositive() ? 1 : -1);
    }
}
