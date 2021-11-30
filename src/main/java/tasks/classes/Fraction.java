package tasks.classes;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }


    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    static Fraction reduceFraction(long x, long y) {
        long d;
        d = __gcd(x, y);

        x = x / d;
        y = y / d;
        return new Fraction(x, y);
    }

    static int __gcd(long a, long b) {
        if (b == 0)
            return (int) a;
        return __gcd(b, a % b);

    }


    public Fraction add(Fraction f2) {
        long resultTop;
        long resultBottom;
        if (bottom == f2.bottom) {
            resultTop = top + f2.top;
            resultBottom = bottom;
            return reduceFraction(resultTop, resultBottom);
        } else
            resultTop = (top * f2.bottom) + (f2.top * bottom);
        resultBottom = bottom * f2.bottom;
        return reduceFraction(resultTop, resultBottom);
    }


    @Override
    public String toString() {
        return "" + top + "/" + bottom + "";
    }

    public void execute(Fraction f1, Fraction f2){
        System.out.println(f1.add(f2));
    }
}