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
        setFraction(scanner.nextDouble());
    }

    public int getInteger() {
        return integer;
    }

    public double getFraction() {
        return fraction;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setInteger(final int integer) {
        this.isPositive = integer >= 0;

        this.integer = Math.abs(integer);
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

    public void setIsPositive(final boolean positive) {
        this.isPositive = positive;
    }

    @Override
    public FractionClass add(final FractionClass a) {
        final FractionClass result = new FractionClassImpl();

        final double sum = this.toDouble() + a.toDouble();

        setInteger((int) sum);
        setFraction(sum % 1);

        return result;
    }

    @Override
    public FractionClass differ(final FractionClass a) {
        final FractionClass result = new FractionClassImpl();

        final double minus = this.toDouble() - a.toDouble();

        setInteger((int) minus);
        setFraction(minus % 1);

        return result;
    }

    @Override
    public FractionClass multi(final FractionClass a) {
        final FractionClass result = new FractionClassImpl();

        final double product = this.toDouble() * a.toDouble();

        setInteger((int) product);
        setFraction(product % 1);

        return result;
    }

    @Override
    public FractionClass divide(final FractionClass a) throws ArithmeticException {
        final FractionClass result = new FractionClassImpl();

        if (a.toDouble() == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        }
        final double division = this.toDouble() / a.toDouble();

        setInteger((int) division);
        setFraction(division % 1);

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
